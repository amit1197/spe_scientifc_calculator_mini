apipeline{
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
     }
  }