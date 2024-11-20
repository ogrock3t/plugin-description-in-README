plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jetbrains.intellij") version "1.14.2"
}

repositories {
    mavenCentral()
}

intellij {
    version.set("2023.2")
    type.set("PY")
}

dependencies {
    implementation(kotlin("stdlib"))
}
