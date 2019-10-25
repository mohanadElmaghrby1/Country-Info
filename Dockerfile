FROM openjdk:8-jdk-alpine
ADD target/country-spring-boot.jar country-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java" , "-jar" , "country-spring-boot.jar"]