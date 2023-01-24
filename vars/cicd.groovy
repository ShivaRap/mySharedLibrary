def gitDown(repo) {
  git "${repo}"
}
def mavenBuild{
   sh '''mvn package'''
}
