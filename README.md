##Tracky

### Description

Tracky is an Issue Tracker application providing a REST API. This Application is one of my pet projects where I'm experimenting with Kubernetes, Java EE and Cucumber.
 
###Lifecycle

To manage minikube
```bash
make start-minikube
make stop-minikube
```
To build and deploy the app
```bash
make build
```
To run the test suite
```bash
make test
```
To interact with the database
```bash
make start-db
make stop-db
make migrate-db
```


To access PGADMIN to play with the database

Access http://0.0.0.0:99 with the browser

Use the following information to connect to the tracky database
 - System: PostgreSQL
 - host: postgres:5432/tracky
 - user: tracky
 - password: tracky
 - schema: tracky

###Stories
####Focus
- [ ] Database Container
    - [x] create a docker container
    - [x] flyway migration
    - [x] use openliberty as application server technology
        - [ ] display hello world from app
    - [ ] configure datasource on middleware
    - [ ] configure datasource with env variable
    - [ ] add PGADMIN container to manage data
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

