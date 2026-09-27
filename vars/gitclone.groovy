def call(String branch,String url){
  echo "code is cloning from Github"
  git branch: "${branch}", url: "${url}"
  echo "project clone successfull"
}
