# RxJava

RxJava is a Java based extension of ReactiveX.

Setup

    Below maven dependency needs to be added in pom.xml
    
        <dependency>
            <groupId>io.reactivex.rxjava2</groupId>
            <artifactId>rxjava</artifactId>
            <version>2.1.1</version>
        </dependency>
        
Reactive Manifesto

    Responsive – systems should respond in a timely manner
    Message Driven – systems should use async message-passing between components to ensure loose coupling
    Elastic – systems should stay responsive under high load
    Resilient – systems should stay responsive when some components fail
    
Key components of RxJava

RxJava have two key components: Observables and Observer.

    Observable:
        It represents an object similar to Stream which can emit zero or more data, can send error message,
        whose speed can be controlled while emitting a set of data, can send finite as well as infinite data.
Example [Observable](RxJava-project/src/main/java/RxJavaTest.java)
    
    Observer:
        It subscribes to Observable's data of sequence and reacts per item of the observables. 
        Observers are notified whenever Observable emits a data. 
        An Observer handles data one by one.
    
    An observer is never notified if items are not present or a callback is not returned for a previous item.
    
    