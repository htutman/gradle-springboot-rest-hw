# gradle-springboot-rest-hw

Simple Gradle Spring Boot REST Hello World Java application prepared for Heroku deployment.

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy)

## Invoke REST end-point on Heroku

```sh
curl https://[Heroku App Name].herokuapp.com/hello
```

## Run locally

Java and Gradle need to be installed locally. Make sure the [Heroku CLI](https://cli.heroku.com/) is installed.

```sh
git clone https://github.com/htutman/gradle-springboot-rest-hw.git
cd gradle-springboot-rest-hw
gradle clean build
heroku local:start
```

### Invoke REST end-point locally

```sh
curl localhost:5000/hello
```
