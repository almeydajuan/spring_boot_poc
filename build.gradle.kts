plugins {
    id("org.springframework.boot") version "3.3.0"
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.4.4")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.4")
    implementation("org.hsqldb:hsqldb:2.7.4")

    testImplementation("org.springframework.boot:spring-boot-starter-test:3.4.4")
    testImplementation("org.hsqldb:hsqldb:2.7.4")
}

group = "ar.com.jalmeyda"
version = "1.0"
description = "Spring Boot POC"
java.sourceCompatibility = JavaVersion.VERSION_21

tasks {
    test {
        useJUnitPlatform()
    }
}



