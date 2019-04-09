def jobName = "cra-jenkins-ci0"
try {
  pipelineJob(jobName) {
    definition {
      cpsScm {
        scm {
          git(
            "https://github.com/Dkra/cra-jenkins",
            "master"
          )
        }
        scriptPath("./jenkins/${jobName}/Jenkinsfile")
      }
    }
  }
} catch (err) {
  throw err
}
