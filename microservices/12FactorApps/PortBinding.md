# Port Binding

Export services via port binding

The idea is that, just like all the backing services you are consuming, your application also interfaces to the world 
using a simple URL.

Usually you get this for free because your application is already presenting itself through a web-server. 
But let’s say you have an API that’s used by both your customers in the outside world (untrusted) and your internal 
website (trusted). You might create a separate URL to your API that your website can use which doesn’t go through
the same security (firewall and authentication), so it’s a bit faster for you than for untrusted clients.

Port binding is one of the fundamental requirements for microservices to be autonomous and self-contained.

Spring Boot embeds Tomcat in applications and exports HTTP as a service by binding to a port and listening to 
incoming requests to that port.

We can configure the port by setting the server.port configuration property. The default value is 8080.
