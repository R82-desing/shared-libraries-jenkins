def call(String Imagename, String Imagetag) {
    echo "Building the code"
    sh "docker build -t ${Imagename}:${Imagetag} ."
}
