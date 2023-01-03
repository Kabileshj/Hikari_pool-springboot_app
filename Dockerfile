FROM openjdk:11
ADD target/hikari_pool-springboot_app.jar hikari_pool-springboot_app.jar
ENTRYPOINT ["java","-jar","/hikari_pool-springboot_app.jar"]