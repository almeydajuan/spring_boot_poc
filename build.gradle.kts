plugins {
    id("org.springframework.boot") version "3.3.0"
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.4.5")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.5")
    runtimeOnly("org.postgresql:postgresql")

    testImplementation("org.springframework.boot:spring-boot-starter-test:3.4.5")
    testImplementation("org.springframework.boot:spring-boot-testcontainers:3.4.5")
    testImplementation("org.flywaydb:flyway-core:11.8.0")
    testImplementation("org.flywaydb:flyway-database-postgresql:11.8.0")
    testImplementation("org.postgresql:postgresql:42.7.5")
    testImplementation("org.testcontainers:junit-jupiter:1.21.0")
    testImplementation("org.testcontainers:postgresql:1.21.0")

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



