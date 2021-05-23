# Backing Services 

Treat backing services as attached resources

A backing service is any service the app consumes over the network as part of its normal operation. 
Examples include datastores (such as MySQL or CouchDB), messaging/queueing systems (such as RabbitMQ or Beanstalkd), 
SMTP services for outbound email (such as Postfix), and caching systems (such as Memcached).

The code for a twelve-factor app makes no distinction between local and third party services. 
To the app, both are attached resources, accessed via a URL or other locator/credentials stored in the config. 

Example: 
  spring.datasource.url=${JDBC_DATABASE_URL}
  
Each distinct backing service is a resource. For example, a MySQL database is a resource; two MySQL databases
(used for sharding at the application layer) qualify as two distinct resources. 
The twelve-factor app treats these databases as attached resources, 
