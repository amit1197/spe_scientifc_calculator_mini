FROM openjdk:18-alpine
EXPOSE 8081
ADD target/spe_scientifc_calculator_mini-0.0.1-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java","-jar","calculator.java"]