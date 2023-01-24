def gitDown(repo) {
  git "${repo}"
}
def mavenBuild{
   sh "mvn package"
}
def newDeploy(workspace, ip, contextPath){
   sh "scp /var/lib/jenkins/workspace/${workspace}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextPath}.war"
}
 
