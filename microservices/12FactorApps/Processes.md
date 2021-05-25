# Processes

Processes should be stateless

Twelve-factor processes are stateless and share-nothing. 
Any data that needs to persist must be stored in a stateful backing service, typically a database.

Some web systems rely on “sticky sessions” – that is, caching user session data in memory of the app’s
process and expecting future requests from the same visitor to be routed to the same process. 
Sticky sessions are a violation of twelve-factor and should never be used or relied upon. 
Session state data is a good candidate for a datastore that offers time-expiration, such as Memcached or Redis.
