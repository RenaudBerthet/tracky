start-minikube:
	minikube start
	eval $(minikube docker-env)
build:
	mvn clean package
	eval $(minikube docker-env)
	docker build ./k8s -t tracky-node:dev
	kubectl apply -f ./k8s
monitor:
	eval $(minikube docker-env)
	kubectl get deployments
stop-minikube:
	minikube stop
	eval $(minikube docker-env)
test:
	mvn verify
start-db:
	docker run --rm --name pg-docker -e POSTGRES_PASSWORD='tracky' -e POSTGRES_USER='tracky' -e POSTGRES_DB='tracky' -d -p 5432:5432 postgres:11.2-alpine
stop-db:
	docker stop pg-docker
migrate-db:
	mvn clean compile
	mvn flyway:clean -P flyway-local
	mvn flyway:repair -P flyway-local
	mvn flyway:migrate -P flyway-local
	mvn flyway:validate -P flyway-local
	mvn flyway:info -P flyway-local
