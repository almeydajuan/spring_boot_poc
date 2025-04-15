plugins {
    id("org.springframework.boot") version "3.3.0"
    java
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://company/com/maven2")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.4.4")
}

group = "ar.com.jalmeyda"
version = "1.0"
description = "Spring Boot POC"
java.sourceCompatibility = JavaVersion.VERSION_21



