# Spring Boot - Flyway Database

    Flyway is a version control application to evolve your Database schema easily and reliably across all your instances.
    Many software projects use relational databases. This requires the handling of database migrations, also often called schema migrations.
    
Configuring Flyway Database:

    Below properties needs to be included in maven POM.xml to include flyway dependency
    
            <dependency>
                <groupId>org.flywaydb</groupId>
                <artifactId>flyway-core</artifactId>
            </dependency>
            
    Include database dependency as well, here we included H2 DB dependency and JPA dependency
    
    Now, create a SQL file under the src/main/resources/db/migration directory. 
    Name the SQL file as “V1__Initial.sql”
    
    After this go to the H2 DB and you will be able to see data in tables 
    http://localhost:8080/h2-console
    
    SCHEMA_VERSION table contains all the logs of executed flyway scripts. 
        For H2 DB it will be flyway_schema_history table. 

