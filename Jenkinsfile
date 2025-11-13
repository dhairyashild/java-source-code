pipeline{
  agent any                                 # as we have separate account for jenkins and slave 
  environment{  
    NAME= " DHAIRYA"
  }

stages{
  stage("chackout code"){
checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/dhairyashild/java-source-code.git']])
  }
}
}











GITHUB REPO+ WEBHOOK SETTING WITH JENKINS :==

    1) WEBHOOK SETTING - REPONAME---WEBHOOK--ADD WEBHOOK---PAYLOAD URL  http://IP-EC2/githb-webhook/      + "Just the push event" or specific events you need
Webhook URL Format:
For an Organization Folder: https://jenkins.yourcompany.com/github-webhook/
For a Multibranch Pipeline inside a Folder: https://jenkins.yourcompany.com/job/Your-Folder/github-webhook/
For a specific Multibranch Pipeline: https://jenkins.yourcompany.com/job/Your-MultiBranch-Pipeline-Name/github-webhook/

    2) TOKEN FOR GITHUB - CLICK ON RIGHT SIDE UR PHOTO -- SETTING-- DEVELOPER SETTING ---PAT --CLASSIC TOKEN ---TICK ON REPO ONLY(IT Jenkins everything to discover branches, read Jenkinsfiles,set commit statuses& manage webhooks automatic.

