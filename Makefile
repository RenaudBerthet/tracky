build-dev:
	docker-compose -f docker-compose.common.yml -f docker-compose.dev.yml build --no-cache
start-dev:
	docker-compose -f docker-compose.common.yml -f docker-compose.dev.yml up
stop-dev:
	docker-compose -f docker-compose.common.yml -f docker-compose.dev.yml down
restart-dev:
	docker-compose -f docker-compose.common.yml -f docker-compose.dev.yml down
	docker-compose -f docker-compose.common.yml -f docker-compose.dev.yml build --no-cache
	docker-compose -f docker-compose.common.yml -f docker-compose.dev.yml up