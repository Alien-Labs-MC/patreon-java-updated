pipeline {
    agent any

    options {
         githubProjectProperty(projectUrlStr: "https://github.com/Alien-Labs-MC/patreon-java-updated")
    }

    triggers {
        githubPush()
    }

    tools {
        maven "Default"
        jdk "JDK 17"
    }

    stages {
        stage ("Maven: Deploy") {
            steps {
                withMaven(options: [artifactsPublisher(disabled: true)]) {
                    sh('mvn deploy -DaltDeploymentRepository="alien-labs::https://nexus.sirblobman.xyz/alien-labs"')
                }
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/patreon-updated-*.jar', fingerprint: true
        }
    }
}
