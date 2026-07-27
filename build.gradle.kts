plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

group = "gerilewy"
version = "1.0-SNAPSHOT"

//repositories {
//    mavenCentral()
//}

dependencies {
    // Узнать какой модуль нам нужен
    // https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html
    implementation("org.springframework:spring-context:7.0.8")
//    testImplementation(platform("org.junit:junit-bom:5.9.1"))
//    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}