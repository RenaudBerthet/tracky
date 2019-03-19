start-minikube:
	minikube start
	eval $(minikube docker-env)
build:
	mvn clean package
	eval $(minikube docker-env)
	docker build . -t tracky-node:dev
test:
	mvn verify
deploy:
	mvn flyway:clean
	mvn flyway:migrate
	eval $(minikube docker-env)
	kubectl apply -f ./k8s
monitor:
	eval $(minikube docker-env)
	kubectl get deployments
