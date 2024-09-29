FROM openjdk:17

WORKDIR /app

COPY target/aws-cicd-orderservice.jar /app

EXPOSE 8080

CMD ["java","-jar","aws-cicd-orderservice.jar"]