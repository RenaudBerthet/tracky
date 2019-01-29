build-dev:
	docker-compose -f docker-compose.yml build --no-cache
start-dev:
	docker-compose -f docker-compose.yml up
stop-dev:
	docker-compose -f docker-compose.yml down