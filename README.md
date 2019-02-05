##Tracky

### Description

Tracky is an Issue Tracker application providing a REST API. This Application is one of my pet projects where I'm experimenting with Docker, Java EE and Cucumber.
 

###Lifecycle

To start or restart the dev environment (Wildfly/Database/Flyway)
```bash
$ make restart-dev
```
To rebuild and redeploy the app
```bash
$ make deploy-war
```
To run the integration test suite
```bash
$ make integration-test
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
- [ ONGOING ] use cucumber to test api
- [ ] add datasource to wildfly container
- [busy] create structure for tables
- [ ] connect successfully with cucumber to jax-rs
- [ ] add exceptions handling
- [ ] add HyperMedia
- [ ] iterate untill all cucumber tests are green
####Backlog
- [ ] add cucumber report
- [ ] expose via rest controller
- [ ] link to repository and mapper
- [ ] add security
- [ ] add multi-tenancy
- [ ] add proper logging
- [ ] add feature toggle
- [ ] use remote REST API
- [ ] use remote SOAP API
- [ ] publish message to JMS
- [ ] receive message to JMS
- [ ] add metrics collection
- [ ] add performance testing
- [ ] use redis to store the users
- [ ] use mongoDB to store the users
- [ ] add JSF to say hello
- [ ] add JSF with CRUD
- [ ] add dynamic SPA
- [ ] add Angular Frontend
- [ ] add React Frontend
- [ ] add message broker usage with events
- [ ] Refactor domain to work events based
- [ ] Store events
- [ ] implements CQRS
####Done
 - [x] persist to database
    - [x] converters from/to domain
    - [x] h2 database
    - [x] entities & repository
    - [x] set ID
- [x] add domain
    - [x] issue
    - [x] comments
    - [x] user
- [x] add beans.xml -> not needed anymore with JavaEE
- [x] add WEB-INF / META-INF
- [x] add cucumber dependencies
- [X] add docker-compose    
- [x] add flyway container
- [x] add PgQSL container
- [x] add test database PgQSL
- [x] use flyway to migrate
- [x] add wildfly container
- [x] deploy app to wildfly container
- [X] enrich Severity Enum + test
- [x] connect successfully with WebBrowser to jax-rs
- [x] connect successfully with PGAdmin to db
- [x] ensure flyway is executing scripts when migrating

