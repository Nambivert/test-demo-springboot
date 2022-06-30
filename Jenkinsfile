pipeline{
    agent any
    stages{
        stage('Checkout'){
            steps {
                git branch: 'main', url: 'https://github.com/nambivert/test-demo-springboot.git'
            }
        }
        stage('Build') {
            steps {
                sh 'gradle clean build'
            }
        }
		stage("sonar quality check"){
			steps{
				script {
					withSonarQubeEnv(installationName: 'sonarcredentialsID: 'sonar-token') {
						sh 'gradle sonarqube'
					}
					timeout(time: 1,unit: 'HOURS') {
						def qg = waitForQualityGate()
						if (qg.status != 'OK') {
							error "Pipeline aborted due to quality failure: ${qq.status}"
						}
					}
				}
			}
		}
  }
}
