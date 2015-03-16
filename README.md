# RESTful Web Services with JAX-RS

Basic RESTful Web Services with JAX-RS 

## How to run application
### Traditionally (requires maven and wildfly)
 - Download wildfly 
 - Start wildfly
```sh
      $ WILDFLY_HOME/bin/standalone.sh &
```
 - Deploy with maven 
```sh
      $ mvn wildfly:deploy
```
  - Deploy traditionally
```sh
      $ mvn clean package
      $ cp target/ROOT.war WILDFLY_HOME/standalone/deployments
```
### With Docker
- Build images [ubuntu/ssh], [ubuntu/jdk8] and [wildfly/base] using provided build.sh scripts
- Start [wildfly/base] container using [run.sh]
- Deploy with maven 
```sh
      $ mvn wildfly:deploy -Dwildfly.username=admin -Dwildfly.password=1admin!
```
- Undeploy with maven 
```sh
      $ mvn wildfly:undeploy -Dwildfly.username=admin -Dwildfly.password=1admin!
```

Point browser to http://localhost:8080/rest/authors/67


[wildfly/base]:https://github.com/tecris/docker/blob/v1.0/wildfly
[ubuntu/ssh]:https://github.com/tecris/docker/blob/v1.0/ubuntu-ssh
[ubuntu/jdk8]:https://github.com/tecris/docker/blob/v1.0/ubuntu-jdk8
[run.sh]:https://github.com/tecris/docker/blob/v1.0/wildfly/run.sh
