package com.microservice.master.controller

import com.microservice.master.Coffee
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import java.util.List
import kotlin.collections.ArrayList

@RestController
@RequestMapping("/coffeeLand")
class RestApiController {
    private val coffees: MutableList<Coffee> = ArrayList()

    init {
        coffees.addAll(
                List.of(
                        Coffee("Cafe Cereza"),
                        Coffee("Cafe Gandor"),
                        Coffee("Cafe Lareno"),
                        Coffee("Cafe Tres Pontas")
                )
        )
    }

    @GetMapping("/coffees")
    fun getCoffees(): Iterable<Coffee> {
        return coffees
    }

    @GetMapping("/coffees/{id}")
    fun getCoffeeById(@PathVariable id: String): Optional<Coffee> {
        for (coffee in coffees) {
            if (coffee.id == id)
                return Optional.of(coffee)
        }
        return Optional.empty()
    }
}
