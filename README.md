This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

# A Multi-job structure Application example

After clone & running the Seedjob repository (https://github.com/Dkra/jenkins-job-dsl-example) in jenkins, it will pull this repository and generate all jobs related to this Application.

### Jenkins Folder Structure

\- jenkins<br/>
&nbsp;&nbsp;&nbsp;&nbsp;\- jobA<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- seedJob.groovy<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- Jenkinsfile<br/>
&nbsp;&nbsp;&nbsp;&nbsp;\- jobB<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- seedJob.groovy<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- Jenkinsfile<br/>

seedJob.groovy: JobDSL plugin use this to generate job<br/>
Jenkinsfile: The pipeline scripts used by the generated job
