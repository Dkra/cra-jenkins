def jobName = "cra-jenkins-ci"

try {
  pipelineJob(jobName) {
    definition {
      cpsScm {
        scm {
          git(
            "https://gitlab.com/Dkra/cra-jenkins-dsl-example.git",
            "master"
          )
        }
        scriptPath("./jenkins/${jobName}/Jenkinsfile")
      }
    }

    triggers {
      cron('*/5 * * * *')
    }

  }
} catch (err) {
  throw err
}
