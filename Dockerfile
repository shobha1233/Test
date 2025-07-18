FROM openjdk:8
EXPOSE 8080
ADD target/shobha_github_actions.jar shobha_github_actions.jar
ENTRYPOINT ["java","-jar","/shobha_github_actions.jar"]
