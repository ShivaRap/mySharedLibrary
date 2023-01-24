def gitDown(repo) {
  git "${repo}"
}
def buildArt{
   sh '''mvn package'''
}
