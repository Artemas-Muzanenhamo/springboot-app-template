# SpringBoot-App-Template-MVC

This is a template SpringBoot application with a simple API that 
retrives some items from a `Service`. Should you wish to use 
JPA, you can just make the necessary changes and have the 
`ExampleService` passing and fetching data from a repository.

## API Usage:

Url | Request | Response
:---: | :---: | :---:
 `localhost:8080/items` | **GET** | `[{"id":"orange","name":"Orange","description":"This is a Citric Fruit","category":"Fruit"}]`

#### Maven Commands

- `mvn spring-boot:run` {Starts up the Spring boot application}
- `mvn clean install` {Runs the maven cycle to execute unit test, generate a jar/war and install your package in your local repository}
- `mvn clean tests` {Executes unit tests}

