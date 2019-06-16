FROM openjdk:8
RUN mkdir /mongoDemo
WORKDIR /mongoDemo
ADD mongoDemo-0.0.1-SNAPSHOT.jar .
ENV MONGODB_HOST=172.17.0.2
ENV MONGODB_PORT=27017
ENV MONGODB_DBNAME=music
CMD ["java", "-jar", "mongoDemo-0.0.1-SNAPSHOT.jar"]