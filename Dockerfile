FROM openjdk:11
EXPOSE 8082
ADD target/spe_scientifc_calculator_mini-0.0.1-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java","-jar","calculator.jar"]