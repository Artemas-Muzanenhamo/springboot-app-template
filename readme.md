# SpringBoot-App-Template-MVC

[![GitHub forks](https://img.shields.io/github/forks/Artemas-Muzanenhamo/springboot-app-template.svg?style=flat-square)](https://github.com/Artemas-Muzanenhamo/springboot-app-template)

[![CircleCI token](https://img.shields.io/circleci/project/github/RedSparr0w/node-csgo-parser/master.svg?style=flat-square)](https://github.com/Artemas-Muzanenhamo/springboot-app-template)

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

