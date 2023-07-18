pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/rajatpzade/nginx_repo.git'
            }
        }
        stage('Deploying to Nginx') {
            agent {
                node {
                    label 'label_1' 
            steps {
                sh 'scp -i /var/lib/jenkins/workspace/pipeline-1/index.html ubuntu@13.213.18.170:/var/www/html/'
                }
            }    
            }
        }
    }
}    