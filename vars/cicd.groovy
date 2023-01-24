def gitDown(repo){
  git "${repo}"
}
def mavenBuild(){
  sh "mvn package"
}
def deploy(workspace,ip,contextPath){
  sh "scp /var/lib/jenkins/workspace/${workspace}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextPath}.war"
}
def runSelenium(workspace){
  sh "java -jar /var/lib/jenkins/workspace/${workspace}/testing.jar"
}
