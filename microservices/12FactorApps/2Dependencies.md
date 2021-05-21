# Dependencies

A twelve-factor app never relies on implicit existence of system-wide packages. 
It declares all dependencies, completely and exactly, via a dependency declaration manifest. 

![Dependencies](https://github.com/umeshwale/code-playarea/blob/master/microservices/12FactorApps/Dependencies1.JPG)

So also it means "Don't Checkin jar files in GIT" :) 

Maven, Gradle should be used to configure dependencies. 
