# RemoteProcedureCall
A remote procedure call in Java for adding two numbers in JAVA. 


## Steps to implement the RPC 

###  Defining the remote interface
Compile the `search.java` from the repository by running the following command 

```naeem@foo:$ javac Search.java```
### Implementing the remote interface
Now we use this search interface in the `SearchQuery.java` in order to write the actual business logic i.e. in this case it's the addition(I am novice!!) but you can use this to write any business logic we want to. 

```naeem@foo:$ javac SearchQuery.java```



### Creating Stub and Skeleton objects from the implementation class using rmic

```naeem@foo:$ rmic SearchQuery```

,
### Start the rmiregistry

```naeem@foo:$ start rmiregistry```

### Running the Server
Once we have the required .class, we can start to compile our  `Server` and the `client`.For server, run the `SearchServer.java`

```naeem@foo:$ javac SearchServer.java```

followed by

```naeem@foo:$ java SearchServer```

### Running the Client

Similar to server, in order to run the client, `ClientRequest.java`

```naeem@foo:$ javac ClientRequest.java```

followed by

```naeem@foo:$ java ClientRequest```


There you have it, you have successfully implemented Remote Method Invocation in Java. Any changes is highly appreciated 
# All the best!
