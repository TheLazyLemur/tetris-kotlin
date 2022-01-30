import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.dan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://dl.cloudsmith.io/public/electron-studio/jaylib/maven/")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("uk.co.electronstudio.jaylib:jaylib:4.0.+")
    implementation ("uk.co.electronstudio.jaylib:jaylib-natives-windows-x86_64:4.0.+")
    implementation ("uk.co.electronstudio.jaylib:jaylib-natives-macosx-x86_64:4.0.+")
    implementation ("uk.co.electronstudio.jaylib:jaylib-natives-linux-x86_64:4.0.+")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}