def jobName = "cra-jenkins-other-scenario"

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
  }
} catch (err) {
  throw err
}
