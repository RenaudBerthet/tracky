##Tracky

### Description

Tracky is an Issue Tracker application providing a REST API. This Application is one of my pet projects where I'm experimenting with Kubernetes, Java EE and Cucumber.
 

###Lifecycle

To start minikube
```bash
make start-minikube
```
To build the app
```bash
make build
```
To run the test suite
```bash
make test
```
To deploy tracky to the minikube cluster
```bash
make deploy
```


To access PGADMIN to play with the database

Access http://0.0.0.0:99 with the browser

Use the following information to connect to the tracky database
 - System: PostgreSQL
 - host: postgres:5432/tracky
 - user: tracky
 - password: password
 - schema: tracky

###Stories
####Focus
- [ ] Database Container
    - [ ] flyway migration
    - [ ] configure datasource on middleware
    - [ ] configure datasource with env variable
####Backlog
- [ ] JPA
    - [ ] add Issue
    - [ ] add Comment
    - [ ] add Severity
    - [ ] add User
- [ ] Jax-RS
    - [ ] Issue
    - [ ] Comment
    - [ ] Severity
    - [ ] User
- [ ] Security
    - [ ] Read about JWT
    - [ ] Secure hello world
    - [ ] Secure the APP with Roles

####Done

