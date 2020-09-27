# JWT 

    Content copied/referred from - https://medium.com/swlh/how-json-web-tokens-work-211ce7b705f7
    
    JWT is stands for JSON Web Tokens 
    
    JSON Web tokens or JWTs are a very popular way to do user authorization in web apps today. 
    JWT has also become very popular in the context of micro services and some of the other developments 
    in the way we build web applications today.
    
    Although JWT is commonly used for managing authorization, the idea behind JWT is actually something else - for 
    exchanging information! 
    There’s an open industry standard specification called RFC 7519 that outlines how a JWT should be structured 
    and how to use it for exchanging information, 
    or claims as it’s usually called. 
    
    The need of Authorisation:
        All these authorization mechanisms have one thing to blame — HTTP.
        HTTP is a stateless protocol. 
        What it means is every interaction in HTTP needs to contain all the information needed for that interaction.
        Nothing is remembered from before. No state is maintained over multiple requests.
        
        Think about this. When you are accessing a page from a server, what information do you need to send it? 
        Well, if it’s a simple static HTML page, you don’t need much. You just send the server the URL of the page 
        you are looking for, 
        and the server sends you back the page. 
        The problem is when the response from the server is dynamic and it depends on who the user is. 
        In this case, the information you send to the server is not just what page you want, you obviously also need 
        to tell the server who you are.
        
        So when you have a server application with pages P1 and P2 that are accessible only by certain users. 
        You tell a server over HTTP who you are and what page you need. 
        The server authorizes you and possibly gives you the page you need. 
        But if you were to follow up with another request, the server would have no idea who you are this time because 
        it doesn’t “remember” what your previous request is. 
        In every interaction, you have to provide all the details and information required for that interaction.
        No dependence on previous information.
        
        Now you might say, “Hang on. That’s not been my experience with web apps” 
        For example, you can log into a banking website with your user ID and password, and then when you go 
        to your accounts page, 
        the website doesn’t go “Wait, who are you?” The website knows who you are! How does it do that?
        
        There are multiple ways that web applications manage and remember sessions and two of the popular ways its
        done both use something called tokens. The two popular options are
            1. Using session tokens
            2. Using JSON Web tokens or JWT.
            
        Understanding session based authorization
            Let me give you an analogy. 
            Let’s say a customer has a support request with a customer care department. 
            He calls them up and tells them what his issues are with, let’s say, a product. 
            The representative tries out some troubleshooting steps and when nothing works, 
            they say “Okay, let me transfer this to some other department and they can help.
            Please call back tomorrow.”
            
            The representative makes a note of all the details including the troubleshooting steps 
            they’ve tried and then saves it in the system, 
            and gives the customer a support ticket. 
            This ticket number is associated with the details the rep has saved in the system,
            so that the next time the customer call back, he doesn’t have to go through all the details same again. 
            When he calls again, he just gives them the ticket number. 
            The new support rep (or maybe the same support rep who doesn’t really remember the previous conversation) 
            looks up the ticket number and get the details they’ve saved in the system.
            
            This is kinda what’s happening with authentication using session tokens. 
            When you authenticate, the server creates a session and keeps track of it itself.
            It creates a session ID to associate with that session and gives that to you. 
            This is like the support ticket in the example we just saw.
            Subsequently, the client passes this token to the server as a part of *every* request, 
            and the server looks it up and it identifies who the client is.
            (A common approach is to save the session ID in a cookie so that it automatically gets added to the cookie
             header on every subsequent request). 
            Since a server typically has to serve multiple clients at the same time, having each client pass in 
            their session ID makes it handy. 
            The server always knows who the client is and can look up the information, all based on this single token.
            
            This mechanism of using session IDs as tokens saved in cookies has been working fine for quite a while now, 
            and in fact, that’s the most popular mechanism for authorization for the most part. 
            There are a few problems with this approach, and that is where JWT comes in. 
            
            Let’s understand what those problems are.
            
        The problem with session IDs
            The biggest problem is that this approach assumes something — that there is always just one monolithic 
            server web application. 
            That used to be the case typically in the past. But that’s no longer the case these days.
            
            You have multiple servers that share the load that sit behind a load balancer. 
            When a request comes in, the load balancer decides which server to route the request to. 
            So, here’s the problem. The user could have had their login request routed to one server, 
            but the next request goes through the load balancer and to a completely different server. 
            Now this new server has no idea about this previous exchange
            
            Okay, the solution is obvious. You introduce a shared session cache that all these servers save sessions 
            to and look up session tokens from. 
            This is a typical use case for a Redis cache sitting over here for this very reason. But this is tricky!
            
        A “switched” model
            Okay, now let’s propose an alternative model.
            Remember the customer service analogy that I told you. 
            Let’s say the service folks don’t maintain state.
            The customer walks up to the service department and the agent asks him what’s wrong, and he tells them. 
            The service guy says “Okay, we’ll work on it. Come back again tomorrow”.
            
            But imagine you are that service rep and you don’t want this customer to repeat his full story to 
            some other rep tomorrow.
            What can you do to make this easy for the customer? 
            You don’t want to save anything at your end, so there’s no case ID you can give the customer.
            What do you do?
            
            Here’s an idea. 
            Instead of registering the case in your system and giving the customer a case number, 
            what you do is you write all the details of the interaction on a piece of paper and hand it to the customer,
            and say “Bring it back with you next time and hand it to the customer rep you talk to. 
            They can read this and understand and get all the details.”
            
            This is a change from the previous model. 
            The customer rep isn’t giving the customer a token ID that refers to the details. 
            The customer rep is giving the customer the details itself. 
            Now if this were to happen, does the support rep have to remember anything? 
            Well, no. It’s the customer’s responsibility to get that piece of paper for the subsequent interaction
            with the support department.
            The service department doesn’t have to remember anything!
            
            Which is good, but there’s a drawback to this approach. 
            Let’s say a customer brings in a piece of paper with a history of issues. 
            How does the sales rep trust it? 
            There might be a malicious customer who takes a piece of paper and writes a complete history of bad customer 
            service and goes to demand for a freebie as a result of being treated badly. 
            You need to make the record of history trustworthy!
            
            Well, one solution is to sign the paper that’s given to the customer. 
            If the sales rep can securely sign the information state handed to the customer, 
            the next time the customer gets it, the new sales rep can verify the signature to ensure it is legit.
            
            This switched model is what is employed in JWT mechanism. 
            Imagine, when the client authenticates, instead of the server saving the user information in a state on 
            the server and returning an ID as token,
            it returns the user information itself as a token. 
            Imagine, a JSON payload being returned with all the user information back. 
            Every time the client makes a subsequent request, it sends the whole JSON token! 
            The server isn’t saving anything.
            
            The token is not an ID that references server state. The token is the value itself! 
            It’s a JSON object which has all the information. 
            This is JSON web tokens!
            
            The problem of security is handled by signing the tokens that’s handled across each time. 
            When the user authenticates, the server just doesn’t send any JSON object. 
            It sends something in a special signed format.
            There’s a signature there. So, when the client sends a subsequent request, the signed JWT is sent back to 
            the server. 
            The server verifies the signature, and it trusts it only if it’s valid.
            
            This is really all that JWT is. 
            A way for a client and a server to communicate and share information directly that has some meaning across 
            multiple interactions 
            without the server having to remember information for each client. 
            The fact that it happens to be between a client and a server and for authorization purposes is actually
            incidental. 
            This could technically be used for anything!
            
        The Structure of JWT Token
            Typical JWT token looks like xxxxx.yyyyy.zzzzz
                Eample: 
                eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3OD
                kwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF
                2QT4fwpMeJf36POk6yJV_adQssw5c
           
            In its compact form, JSON Web Tokens consist of three parts separated by dots (.), 
            which are:
            
                1. Header
                2. Payload
                3. Signature                             
            1. Header:
                The header typically consists of two parts: the type of the token, which is JWT, and the signing 
                algorithm being used, such as HMAC SHA256 or RSA.
                
                For example:
                    
                    {
                      "alg": "HS256",
                      "typ": "JWT"
                    }
                Then, this JSON is Base64Url encoded to form the first part of the JWT.
            2. Payload
               The second part of the token is the payload, which contains the claims. 
               Claims are statements about an entity (typically, the user) and additional data. 
               There are three types of claims: 
                    1. registered
                    2. public
                    3. private claims.
               
               Registered claims: 
                    These are a set of predefined claims which are not mandatory but recommended, to provide a 
                    set of useful, interoperable claims. 
                    Some of them are: iss (issuer), exp (expiration time), sub (subject), aud (audience), and others.
               
                    Notice that the claim names are only three characters long as JWT is meant to be compact.
               
               Public claims: 
                    These can be defined at will by those using JWTs. 
                    But to avoid collisions they should be defined in the IANA JSON Web Token Registry or be defined 
                    as a URI that contains a collision resistant namespace.
               
               Private claims: 
                    These are the custom claims created to share information between parties that agree on using 
                    them and are neither registered or public claims.
               
               An example payload could be:
               
               {
                 "sub": "1234567890",
                 "name": "John Doe",
                 "admin": true
               }
               The payload is then Base64Url encoded to form the second part of the JSON Web Token.
               
               Do note that for signed tokens this information, though protected against tampering, 
               is readable by anyone. 
               Do not put secret information in the payload or header elements of a JWT unless it is encrypted.
               
           3. Signature
                 To create the signature part you have to take the encoded header, 
                 the encoded payload, a secret, the algorithm specified in the header, and sign that.
               
               For example if you want to use the HMAC SHA256 algorithm, 
               the signature will be created in the following way:
               
               HMACSHA256(
                 base64UrlEncode(header) + "." +
                 base64UrlEncode(payload),
                 secret)
               
               The signature is used to verify the message wasn't changed along the way, and, 
               in the case of tokens signed with a private key, it can also verify that the sender of the JWT is 
               who it says it is.
               
           Putting all together
               The output is three Base64-URL strings separated by dots that can be easily passed in HTML 
               and HTTP environments,
               while being more compact when compared to XML-based standards such as SAML.
               
               The following shows a JWT that has the previous header and payload encoded, 
               and it is signed with a secret. Encoded JWT
               
               If you want to play with JWT and put these concepts into practice, 
               you can use jwt.io Debugger to decode, verify, and generate JWTs.
               
    How do JSON Web Tokens work?
            In authentication, when the user successfully logs in using their credentials,
            a JSON Web Token will be returned. 
            Since tokens are credentials, great care must be taken to prevent security issues. 
            In general, you should not keep tokens longer than required.
           
           You also should not store sensitive session data in browser storage due to lack of security.
           
           Whenever the user wants to access a protected route or resource, 
           the user agent should send the JWT, typically in the Authorization header using the Bearer schema.
           The content of the header should look like the following:
           
           Authorization: Bearer <token>
           
           This can be, in certain cases, a stateless authorization mechanism. 
           The server's protected routes will check for a valid JWT in the Authorization header,
           and if it's present, the user will be allowed to access protected resources. 
           If the JWT contains the necessary data, the need to query the database for certain operations may be reduced, 
           though this may not always be the case.
           
           If the token is sent in the Authorization header, 
           Cross-Origin Resource Sharing (CORS) won't be an issue as it doesn't use cookies.
           
           The following diagram shows how a JWT is obtained and used to access APIs or resources:
           
    How does a JSON Web Token work
           
       The application or client requests authorization to the authorization server. 
       This is performed through one of the different authorization flows. 
       For example, 
        a typical OpenID Connect compliant web application will go through the /oauth/authorize endpoint using 
        the authorization code flow.
        When the authorization is granted, the authorization server returns an access token to the application.
        The application uses the access token to access a protected resource (like an API).
        Do note that with signed tokens, all the information contained within the token 
        is exposed to users or other parties, even though they are unable to change it.
        This means you should not put secret information within the token.
           
    Why should we use JSON Web Tokens?
           Let's talk about the benefits of JSON Web Tokens (JWT) when compared to Simple Web Tokens (SWT)
            and Security Assertion Markup Language Tokens (SAML).
           
           As JSON is less verbose than XML, when it is encoded its size is also smaller, 
           making JWT more compact than SAML. 
           This makes JWT a good choice to be passed in HTML and HTTP environments.
           
           Security-wise, SWT can only be symmetrically signed by a shared secret using the HMAC algorithm.
           However, JWT and SAML tokens can use a public/private key pair in the form of a X.509 certificate for signing. 
           Signing XML with XML Digital Signature without introducing obscure security holes is very difficult 
           when compared to the simplicity of signing JSON.
           
           JSON parsers are common in most programming languages because they map directly to objects.
           Conversely, XML doesn't have a natural document-to-object mapping. 
           This makes it easier to work with JWT than SAML assertions.
           
           Regarding usage, JWT is used at Internet scale. 
           This highlights the ease of client-side processing of the JSON Web token on multiple platforms, 
           especially mobile.
           
           Comparing the length of an encoded JWT and an encoded SAML Comparison of the length of an 
           encoded JWT and an encoded SAML
           
           If you want to read more about JSON Web Tokens and even start using them to perform authentication 
           in your own applications,
           browse to the JSON Web Token landing page at Auth0.
               
