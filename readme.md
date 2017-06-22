# SpringBoot-App-Template-MVC

[![GitHub forks](https://img.shields.io/github/forks/Artemas-Muzanenhamo/springboot-app-template.svg?style=flat-square)](https://github.com/Artemas-Muzanenhamo/springboot-app-template)

[![Twitter Follow](https://img.shields.io/twitter/follow/ArtemasPrime.svg?style=social&label=Follow)](https://twitter.com/ArtemasPrime)

[![CircleCI token](https://circleci.com/gh/Artemas-Muzanenhamo/springboot-app-template/tree/SpringBoot-Basic-API-Template.svg?style=shield&circle-token=e72b3266af7d90bfdfc90166ad2b661aca5e2362)](https://github.com/Artemas-Muzanenhamo/springboot-app-template)

/Artemas-Muzanenhamo/springboot-app-template/tree/feature/SpringBoot-Basic-API-Template

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

