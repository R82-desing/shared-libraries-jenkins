def call(String Imagename, String Imagetag){
  echo "image push to docker hub"
  withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]){
    // Docker Hub Login
    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
    // Image ko Docker Hub format me Tag karein
    sh 'docker tag ${Imagename}:${Imagetag} $DOCKER_USER/${Imagename}:${Imagetag}'
    // Docker Hub par Push karein
    sh 'docker push $DOCKER_USER/${Imagename}:${Imagetag}'
  }
}
