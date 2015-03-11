# RESTful Web Service with JAX-RS

This project aims for a simple, yet deployable (tested in wildfly), REST Web Service with JAX-RS 

## How to run application
### Traditionally (requires maven and wildfly)
 - Download wildfly 
 - Start wildfly
```sh
      $ WILDFLY_HOME/bin/standalone.sh &
```
 - Deploy
  - with maven 
```sh
      $ mvn wildfly:deploy
```
  - traditionally
```sh
      $ mvn clean package
      $ cp target/ROOT.war WILDFLY_HOME/standalone/deployments
```
### With Docker
    to do
  
Point browser to http://localhost:8080/rest/integration/user/67



