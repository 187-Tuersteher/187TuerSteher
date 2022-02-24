plugins {
    java
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:5.0.0-alpha.8")
    implementation("io.github.CinemaScope:dotenv-java:2.2.0")
    implementation("ch.qos.logback:logback-classic:1.2.10")
}