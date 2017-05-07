
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
3. Create GoogleCloudController
    * REST Controller which implements endpoints required by Google Cloud


# Spring Boot + Docker + Google Cloud 

This Spring Boot project is also setup to build Docker images.  Additionally, the Docker images can be run as a 
Google App Engine Custom Runtime.

Cloud Container builder: `./gradlew clean && gcloud container builds submit --config=java.yaml .`
* Run Gradle "clean" task before the container builder submit command tars and uploads the directory

Google Cloud App Engine: `./gradlew build && gcloud app deploy app.yaml`

* Adapted from: https://github.com/GoogleCloudPlatform/runtime-builder-java
  * $REPO_NAME and such aren't defined, only available on triggered builds
  * https://cloud.google.com/container-builder/docs/api/build-requests
* Uses the Google App Engine Flexible environment
  * https://cloud.google.com/appengine/docs/flexible/java/dev-java-only
  * https://cloud.google.com/appengine/docs/flexible/custom-runtimes/build
  * https://github.com/GoogleCloudPlatform/openjdk-runtime
  * https://cloud.google.com/appengine/docs/flexible/java/flexible-for-standard-users
        