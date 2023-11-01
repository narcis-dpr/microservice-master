package com.microservice.master

import java.util.*

class Coffee(val id: String, var name: String) {

    constructor(name: String) : this(UUID.randomUUID().toString(), name)
}
