plugins {
    kotlin("jvm") version "1.3.0"
    application
}
dependencies {
    compile(kotlin("stdlib"))

    compile("org.jooby:jooby:1.6.0")
    compile("org.jooby:jooby-lang-kotlin:1.6.0")

    runtime("org.jooby:jooby-netty:1.6.0")
}

repositories {
    mavenCentral()
}

application {
    mainClassName = "de.klg71.joobytest.MainKt"
}
