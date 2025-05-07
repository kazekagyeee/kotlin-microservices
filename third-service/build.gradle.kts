plugins {
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22"
    kotlin("plugin.jpa") version "1.9.22"
}

group = "com.kazekagyee"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    // Spring Web - для создания REST API и веб-приложений
    implementation("org.springframework.boot:spring-boot-starter-web")
    // Jackson Module Kotlin - для сериализации/десериализации JSON в Kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // Kotlin Reflect - для рефлексии в Kotlin
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    // Spring Actuator - для мониторинга и управления приложением
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    // Spring Kafka - для работы с Apache Kafka (асинхронная коммуникация)
    implementation("org.springframework.kafka:spring-kafka")
    implementation("org.apache.kafka:kafka-clients:3.7.0")
    // Spring Test - для тестирования
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    archiveFileName.set("third-service.jar")
}