pipeline {
  agent any

  tools {
    // Nombre dado a la instalación de Maven en "Tools configuration"
    maven "maven"
  }

  stages {
    stage('Git fetch') { 
      steps {
        // Get some code from a GitHub repository
        git 'https://github.com/jgt627/clasehmis2020-jgt627.git'
      }
    }
    stage('Compile, Test, Package') { 
      steps {
        // When necessary, use '-f path-to/pom.xml' to give the path to pom.xml
        // Run goal 'package'. It includes compile, test and package.
        sh "mvn  -f sesion07jgt627/pom.xml clean package" 
      }
      post { 
        // Record the test results and archive the jar file.
        success {
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts '**/target/*.jar'
          jacoco(execPattern: '**/target/jacoco.exec', classPattern: '**/target/classes', sourcePattern: '**/src/', exclusionPattern: '**/test/')
        publishCoverage adapters:
        [jacocoAdapter('**/target/site/jacoco/jacoco.xml')] 
        }
      }
    }
    stage('Analysis'){
        steps{
         sh "mvn -f sesion07jgt627/pom.xml site"   
        }
        post{
            success{ 
                dependencyCheckPublisher pattern: '**/target/site/dependency-check-report.xml'
                recordIssues enabledForFailure: true, tool: checkStyle()
                recordIssues enabledForFailure: true, tool: pmdParser()
                recordIssues enabledForFailure: true, tool: cpd()
                recordIssues enabledForFailure: true, tool: findBugs()
                recordIssues enabledForFailure: true, tool: spotBugs()
            }
        }
    }
    
    stage ('Documentation') {
     steps {
	    sh "mvn -f sesion07jgt627/pom.xml javadoc:javadoc javadoc:aggregate"
     }
     post{
       success {
         step $class: 'JavadocArchiver', javadocDir: 'sesion07jgt627/target/site/apidocs', keepAll: false
         publishHTML(target: [reportName: 'Maven Site', reportDir: 'sesion07jgt627/target/site', reportFiles: 'index.html', keepAll: false])
       }
     }
    }
  }
}