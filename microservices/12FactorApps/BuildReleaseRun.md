# Build, Release, Run

Strictly separate build and run stages

Read More - https://12factor.net/build-release-run

A codebase is transformed into a (non-development) deploy through three stages:

  1. The build stage is a transform which converts a code repo into an executable bundle known as a build. 
     Using a version of the code at a commit specified by the deployment process, the build stage fetches 
     vendors dependencies and compiles binaries and assets.
  2. The release stage takes the build produced by the build stage and combines it with the deploy’s current config. 
     The resulting release contains both the build and the config and is ready for immediate execution 
     in the execution environment.
  3. The run stage (also known as “runtime”) runs the app in the execution environment, by launching some set 
     of the app’s processes against a selected release.

  ![BuildReleaseRun](https://github.com/umeshwale/code-playarea/blob/master/microservices/12FactorApps/BuildReleaseRun.JPG)
