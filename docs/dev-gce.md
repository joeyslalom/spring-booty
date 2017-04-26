
## Install tools

1. Install google cloud tools
    * homebrew install Caskroom/cask/google-cloud-sdk
    * Put Google cloud tools into path / autocomplete (advice given during setup)
    * Run gcloud init
2. Project needs gradle wrapper

## Setup

1. Create java.yaml
    * https://github.com/GoogleCloudPlatform/runtime-builder-java
    * Build step will detect this is a gradle project and run ./gradlew build
2. Create app.yaml
    * https://cloud.google.com/appengine/docs/flexible/java/configuring-your-app-with-app-yaml
    
## Build    
    
1. ./gradlew clean
    * Next command tars the directory and uploads
2. gcloud container builds submit --config=java.yaml .
    * $REPO_NAME and such aren't defined, only available on triggered builds
    * https://cloud.google.com/container-builder/docs/api/build-requests


* http://stackoverflow.com/questions/42638864/google-cloud-builder-gradle
* https://github.com/GoogleCloudPlatform/cloud-builders
