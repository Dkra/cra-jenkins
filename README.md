This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

# A Multi-job structure Application example

After clone & running the Seedjob repository (https://github.com/Dkra/jenkins-job-dsl-example) in jenkins, it will pull this repository and generate all jobs related to this Application.

# Jenkins Folder Structure

\- jenkins
&nbsp;&nbsp;&nbsp;&nbsp;\- jobA
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- seedJob.groovy
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- Jenkinsfile
&nbsp;&nbsp;&nbsp;&nbsp;\- jobB
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- seedJob.groovy
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- Jenkinsfile

seedJob.groovy: JobDSL plugin use this to generate job
Jenkinsfile: The pipeline scripts used by the generated job
