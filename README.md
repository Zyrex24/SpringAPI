# SpringApiTest

A minimal Spring Boot API using Java 21. It includes simple Controller, Service, Repository, and Model layers.

## Requirements
- Java 21 or newer
- No global Maven required (the project includes the Maven Wrapper)

## Getting started
Run the app with the Maven Wrapper.

- Windows (PowerShell or CMD):
```
.mvnw.cmd spring-boot:run
```

If port 8080 is already in use, run on a different port (for example 8081):
```
.mvnw.cmd spring-boot:run -Dspring-boot.run.arguments="--server.port=8081"
```

## Test the API
- List all hello messages
```
curl.exe http://localhost:8080/api/hello
```
Expected output (example):
```
[
  {"id":1,"message":"Hello World"}
]
```

- Get a single message by id
```
curl.exe http://localhost:8080/api/hello/1
```
Expected output (example):
```
{"id":1,"message":"Hello World"}
```

- Browser: open http://localhost:8080/api/hello or http://localhost:8080/api/hello/1

- Postman: import the collection at `postman/SpringApiTest.postman_collection.json` and send the requests above.

## Project structure
```
SpringApiTest/
  pom.xml
  mvnw, mvnw.cmd
  .mvn/wrapper/
  postman/
    SpringApiTest.postman_collection.json
  src/
    main/
      java/
        com/example/springapitest/
          SpringApiTestApplication.java
          controller/
            HelloController.java
          model/
            Hello.java
          repository/
            HelloRepository.java
          service/
            SpringbootHelloWorldAppService.java
      resources/
        application.properties
```

## Components overview
- Controller: Handles HTTP requests. `HelloController` maps `GET /api/hello` and `GET /api/hello/{id}`.
- Service: `SpringbootHelloWorldAppService` contains the application logic.
- Repository: `HelloRepository` is an in-memory store seeded with one record.
- Model: `Hello` contains `id` and `message`.
- Routes: Declared with annotations such as `@GetMapping` in controllers.


