#Maven

    Maven is a build and dependency management tool for Java based application development. 
    Just like other Java based development tools, it is not installed as Windows service, rather it is configured 
    using windows environment variables.
    
    **Why do we use Maven?**
        Maven is chiefly used in java based projects. 
        This tool helps in building the code downloading dependencies.
        This tool is used to build and manage java based projects.
        It simplifies the day to day work of java developer  & help them in the projects. 
        Maven helps in getting right JAR files for project as there may be different versions of separate package.
        To download dependencies it is no more required to visit the official website of each software. it could now 
        easily be done now by visiting "mvnrepository.com"
        
   
    **What is Maven?**
        Maven is a popular open source build tool developed by the apache group to build, publish and deploy 
        several projects at once.
        It simplifies the day to day work of java developer  & help them in the projects. 
        Maven is based on Project Object Model (POM) and focuses on simplification & standardisation. 
        
    **Maven Repository**
        Maven repository refers to the directories of packaged jar files that contains metadata. 
        The metadata refers to the POM files relevant to each project. This metadata allows MAven to downlaod dependencies.
        There are three types of repositories - 
            1. Local Repository - Your PC
            2. Remote Repository - Any Server
            3. Central Repository - Internet
            
    **Basic concepts of Maven**
        **POM:**
            Project Object Model (POM) refers to XML file that have all the information regarding project & configuration details.
            POM XML file is in the project home directory, Maven searches for the POM in the current directory 
            when any task is to be executed.
        **Dependencies & Repositories:**
            Dependencies refers to the java liabraries that needed for the project.
            Repositories refers to the directory of packaged JAR files.
            If the dependencies are not present in local repository then maven download them from central reository
            and cache them in local repository
        **Build Life Cycle, Phases & Goals:**
            Build life cycle consist of a sequence of build phases. 
            Each build phase consist of sequence of goals.
            Each goal is reposible for a particular task.
        **Build Profiles:**
            Build profile refers to the set of configuration values, that are required to build a project 
            using different configurations.
        **Build Plugins:**
            Maven plugin referes to the group of goals. These goals may or may not be of same phase.
            The plugins are used to perform specific goals.
            
        
    **Maven Build Lifecycle:**
        Maven lifecycle is a collection of steps that are to be followed to build a project.
        There are three build-in life cycles - 
            1. Default: handles project deployment
            2. Clean: handles project cleaning
            3. Site: handles the creation of project site's documentation.
        The build cycle has different build phases or stages as below 
            
            **validate-->compile --> Test-Compile --> Test --> package --> Integration Test --> verify --> Install --> Deploy**
            
            **validate** : validate the project is correct and all necessary information is available.
            **Compile**: compile will compile the source code
            **Test-Compile**: Test compile will compile the Test source code
            **Test**: test the compiled source code using a suitable unit testing framework. These tests should not require 
                the code be packaged or deployed
            **Package**: take the compiled code and package it in its distributable format, such as a JAR/WAR/EAR
            **Integration-Test**: process and deploy the package if necessary into an environment where integration tests can be run.
            **Verify**:  run any checks to verify the package is valid and meets quality criteria. 
            **Install**: nstall the package into the local repository, for use as a dependency in other projects locally. 
            **Deploy**: Deploy code in artifactory repository
            
    **Maven setup:**
        Download maven from - https://maven.apache.org/download.cgi (Binary zip archieve)
        Extract it to the local location. 
        Go to Environment variable --> Add new MAVEN_HOME with above local location path
        Update Path in Environment variable to include %MAVEN_HOME%\bin
        go to command prompt and verify if it is installed with command mvn -version
   
    **Maven commands**
        mvn clean install : This command removes the target directory with all the build data before starting the build process.
        mvn clean install : DskipTests = skips the tests
        mvn clean install -Dmaven.test.skip=true : skips tests with skiping test-compile 
        mvn -X clean install : Runs in debug mode with more detailed logs 
        mvn help:effective-pom : Generates POM, parent POM and super POM 
        mvn help:effective-pom -Doutput=filename.xml : output to filename.xml  
        mvn help:effective-settings
        mvn dependency:tree : displays the dependency tree
        mvn dependency:sources : source code will also be downloaded
        mvn --help : Maven command helps 
        mvn clean install -T 2C : Multiple threads    
    
    **What is dependency scope? Name all the dependency scope.**
        Dependency scope includes dependencies as per the current stage of the build. Various Dependency Scopes are −
            compile -  This scope indicates that dependency is available in classpath of project. It is default scope.
            provided - This scope indicates that dependency is to be provided by JDK or web-Server/Container at runtime.
            runtime - This scope indicates that dependency is not required for compilation, but is required during execution.
            test - This scope indicates that the dependency is only available for the test compilation and execution phases.
            system -  This scope indicates that you have to provide the system path.
            import - This scope is only used when dependency is of type pom. This scope indicates that the specified POM should
                      be replaced with the dependencies in that POM's <dependencyManagement> section.    