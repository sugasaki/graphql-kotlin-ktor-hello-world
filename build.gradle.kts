val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val graphql_kotlin_server_version: String by project

plugins {
    application
    kotlin("jvm") version "1.5.21"
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.cio.EngineMain")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-jackson:$ktor_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")

    implementation("com.expediagroup:graphql-kotlin-server:$graphql_kotlin_server_version")

    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlin_version")
}
