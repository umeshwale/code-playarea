# Processes

Processes should be stateless

Twelve-factor processes are stateless and share-nothing. 
Any data that needs to persist must be stored in a stateful backing service, typically a database.

Some web systems rely on “sticky sessions” – that is, caching user session data in memory of the app’s
process and expecting future requests from the same visitor to be routed to the same process. 
Sticky sessions are a violation of twelve-factor and should never be used or relied upon. 
Session state data is a good candidate for a datastore that offers time-expiration, such as Memcached or Redis.

It’s likely you will have your application running on many servers, because that makes it more fault tolerant, 
and because you can support more traffic. 
As a rule, you want each of those instances of running code to be stateless. 
In other words, the state of your system is completely defined by your databases and shared storage, and not by 
each individual running application instance.

Let’s say you have a signup workflow, where a user has to enter 3 screens of information to create their profile. 
One (wrong) model would be to store each intermediate state in the running code, and direct the user back to the
same server until the signup process is complete. The right approach is to store intermediate data in a database 
or persistent key-value store, so even if the web server goes down in the middle of the user’s signup, another
web server can handle the traffic, and the system is none-the-wiser.
