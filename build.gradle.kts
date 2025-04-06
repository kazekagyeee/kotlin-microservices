plugins {
    // Spring Boot plugin for building Spring Boot applications
    id("org.springframework.boot") version "3.2.3" apply false
    // Spring dependency management plugin for managing Spring dependencies
    id("io.spring.dependency-management") version "1.1.4" apply false
    // Kotlin JVM plugin for Kotlin support
    kotlin("jvm") version "1.9.22" apply false
    // Kotlin Spring plugin for Spring support in Kotlin
    kotlin("plugin.spring") version "1.9.22" apply false
    // Kotlin JPA plugin for JPA support in Kotlin
    kotlin("plugin.jpa") version "1.9.22" apply false
}

allprojects {
    group = "com.kazekagyee"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "org.jetbrains.kotlin.plugin.jpa")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    java {
        sourceCompatibility = JavaVersion.VERSION_17
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
} 