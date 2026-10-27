package org.example

open class Vehicle {
    open val speed = 0
    open val name = "Vehicle"

    open fun start() {
        println("$name started moving at $speed km/h")
    }

    open fun stop() {
        println("$name stopped")
    }
}

class Boat : Vehicle() {
    override val speed = 40
    override val name = "Boat"

    override fun start() {
        println("$name is sailing at $speed km/h")
    }

    override fun stop() {
        println("$name stopped at the pier")
    }
}

class Airplane : Vehicle() {
    override val speed = 850
    override val name = "Airplane"

    override fun start() {
        println("$name took off at $speed km/h")
    }

    override fun stop() {
        println("$name landed")
    }
}

class Tank : Vehicle() {
    override val speed = 60
    override val name = "Tank"

    override fun start() {
        println("$name started moving at $speed km/h")
    }

    override fun stop() {
        println("$name stopped")
    }
}

fun main() {
    val boat = Boat()
    boat.start()
    boat.stop()

    val airplane = Airplane()
    airplane.start()
    airplane.stop()

    val tank = Tank()
    tank.start()
    tank.stop()
}