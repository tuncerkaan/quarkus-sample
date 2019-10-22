# Build and Run the Quarkus Application

## JVM Mode 
./mvnw -DskipTests clean package

## Native Mode
./mvnw -DskipTests clean package -Pnative

_To run application for native mode_
./target/quarkus-sample-1.0-SNAPSHOT-runner

## Docker-Native Mode
./mvnw package -DskipTests -Pnative -Dnative-image.docker-build=true

_Build and run_
docker build -f src/main/docker/Dockerfile.jvm -t example/quarkus-sample:1.0-SNAPSHOT . && \
docker run -it --rm -p 8080:8080 example/quarkus-sample:1.0-SNAPSHOT

# Run Quarkus Application in Development Mode
./mvnw compile quarkus:dev
