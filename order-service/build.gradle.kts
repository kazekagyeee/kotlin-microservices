plugins {
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22"
    kotlin("plugin.jpa") version "1.9.22"
}

group = "com.kazekagyee"
version = "0.0.1-SNAPSHOT"

tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_17.toString()
    targetCompatibility = JavaVersion.VERSION_17.toString()
}

repositories {
    mavenCentral()
}

dependencies {
    // Spring Web - для создания REST API и веб-приложений
    implementation("org.springframework.boot:spring-boot-starter-web")
    // Spring Data JPA - для работы с базами данных через JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    // Jackson Module Kotlin - для сериализации/десериализации JSON в Kotlin
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // Kotlin Reflect - для рефлексии в Kotlin
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    // Spring Actuator - для мониторинга и управления приложением
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    // Eureka Client - для регистрации сервиса в Eureka Server
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    // OpenFeign - для создания HTTP клиентов и вызова других микросервисов
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
    // H2 Database - встроенная база данных для разработки
    runtimeOnly("com.h2database:h2")
    // Spring Test - для тестирования
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2023.0.0")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    archiveFileName.set("order-service.jar")
} 