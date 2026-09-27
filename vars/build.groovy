def call(){
  echo "building a code"
  sh "docker build -t notes-app:latest ."
}
