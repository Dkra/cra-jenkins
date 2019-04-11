def jobName = "cra-jenkins-cd-example"

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
