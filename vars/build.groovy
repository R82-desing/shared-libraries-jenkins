def call(String Imagename, String Imagetag){
  echo "building a code"
  sh "docker build -t "${Imagename}":"${Imagetag}" ."
}
