package de.klg71.joobytest

import org.jooby.Kooby
import org.jooby.run

val persons = mutableListOf("Max", "July", "Frank")

class App : Kooby({
    get("/helloworld/") {
        "Hello World!"
    }
    get("/person"){
        persons
    }
    get("/person/{id}") {
        persons[param("id").intValue()]
    }
    post("person") {
        persons.add(body(String::class.java))
    }
})

fun main(args: Array<String>) {
    run(::App, *args)
}