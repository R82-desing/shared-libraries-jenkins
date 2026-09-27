def call(){
  echo "deploying a code"
  sh 'docker compose down'
  sh "docker compose up -d"
}
