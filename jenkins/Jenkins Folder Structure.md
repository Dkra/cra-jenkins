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
