pipeline{
    environment
    {
        registry = "amit1197/scientific_calculator"
        registryCredential = 'docker-creds'
        dockerImage = ' '
    }
     agent any
     stages
     {
         stage("step1 git pull"){
          steps{
          git url: "https://github.com/amit1197/spe_scientifc_calculator_mini.git", branch:"master",
          credentialsId: "'git-creds'"
          }
          }
          stage("step2 build maven")
          {
          steps{
          sh "mvn -B -DskipTests clean package"
          }
          }
          stage("step3 test")
          {
          steps
          {
          sh "mvn test"
          }
          }
          stage("step4 build docker image")
                    {
                        steps
                        {
                            script
                                {
                                    dockerImage = docker.build registry + ":latest"
                                }
                        }
                    }
          stage("step5 push docker image to dockerhub")
                              {
                                  steps
                                  {
                                      script
                                          {
                                              docker.withRegistry( '', registryCredential)
                                              {
                                                dockerImage.push()
                                              }
                                          }
                                  }
                              }
          stage('Step 6 Ansible image deploy'){
                      steps{
                          ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'ansible-docker-deploy/inventory', playbook: 'ansible-docker-deploy/deploy-image.yml', sudoUser: null
                          }
                  }

                  stage('Step 7 Ansible container creation'){
                      steps{
                          ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'ansible-docker-deploy/inventory', playbook: 'ansible-docker-deploy/create-container.yml', sudoUser: null
                          }

                  }
     }
  }