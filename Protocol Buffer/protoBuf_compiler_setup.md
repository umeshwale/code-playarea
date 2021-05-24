# Setup Protocol Buf Compiler

1. Go to - https://github.com/protocolbuffers/protobuf
2. Select latest release from releases 
    ![protobuf](/images/protobuf_releases.JPG)
3. Then download Win compatible version 
    Example - protoc-3.17.0-win64.zip
4. Unzip the above compiler
5. Go to the folder using command prompt and you are done. 

I was not able to create .proto file in intellij so I just
 renamed it with .proto and executed using command as below
 protoc -I=C:\NotBackedUp\umesh-personal\protobufjava --java_out=C:\NotBackedUp\umesh-personal\protobufjava C:\NotBackedUp\umesh-personal\protobufjava/Person.proto
 
 When I executed above command then in project structure below files created 
 Package - package com.example.protos;
    1. Person.java
    2. PersonOrBuilder.java
    3. PersonProtos.java
    
Then added maven protobuf dependencies for java 

from https://github.com/protocolbuffers/protobuf/tree/master/java

        <dependency>
          <groupId>com.google.protobuf</groupId>
          <artifactId>protobuf-java</artifactId>
          <version>3.15.3</version>
        </dependency>
        
        <dependency>
          <groupId>com.google.protobuf</groupId>
          <artifactId>protobuf-java-util</artifactId>
          <version>3.15.3</version>
        </dependency>

 
