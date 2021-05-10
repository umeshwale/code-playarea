# Messaging using RabbitMQ

Reference -
   
   - https://www.youtube.com/watch?v=-W0-vN6mk78&list=RDCMUCppSe7mf1kdxA3Ga49rPWBg&index=2
   - https://www.rabbitmq.com/tutorials/tutorial-one-spring-amqp.html
   - https://www.kindsonthegenius.com/microservices/rabbitmq-in-microservices-step-by-step-tutorial-with-springboot/

RabbitMQ is a message broker: it accepts and forwards messages. You can think about it as a post office: when you put the mail that you want posting in a post box, 
you can be sure that Mr. or Ms. Mailperson will eventually deliver the mail to your recipient. In this analogy, RabbitMQ is a post box, a post office and a postman.

The major difference between RabbitMQ and the post office is that it doesn't deal with paper, instead it accepts, stores and forwards binary blobs of data ‒ messages.

RabbitMQ is a message broker. The next question is, ‘what is message broker?’. 
A message broker is simply a computer program that relays messages from the source(sender) to the destination(receiver).
The sender and receiver could be different microservices. Or perhaps, completed different applications.

