
# how to get this working with google container builder + google container engine

## Setup

1. Install google cloud tools
    * homebrew install Caskroom/cask/google-cloud-sdk
2. Put Google cloud tools into path / autocomplete (advice given during setup)
3. Must run gcloud init
4. Have a gradle wrapper

## Build and go

1. Create cloudbuild.yaml
2. The Google Container Builder process is powerful but a weird fit for this project
   * Without having to build the host docker image that will build this project, I can only use something like "java:8"
   which doesn't have Docker, or the docker image, which doesn't have java =/
   * So right now added dryRun = true, so buildDocker will only generate Dockerfile

3. gcloud container builds submit --config=cloudbuild.yaml .
   * This finally worked, but it took some trials.
   * https://cloud.google.com/container-builder/docs/api/build-requests
   * Most notably, $REPO_NAME and such aren't defined, only available on triggered builds

* http://stackoverflow.com/questions/42638864/google-cloud-builder-gradle
* https://github.com/GoogleCloudPlatform/cloud-builders

## Try again

1. Create java.yaml
2. Create app.yaml
3. This process does not require docker plugin or Dockerfile
4. This way looks better; don't need to modify gradle docker plugin, seems more "Google standard"
5. Then I can remove build.gradle changes, cloudbuild.yaml

* https://github.com/GoogleCloudPlatform/runtime-builder-java
* https://cloud.google.com/appengine/docs/flexible/java/configuring-your-app-with-app-yaml

