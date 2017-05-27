package design.pattern.prototype.structure

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Sean on 3/4/2017.
 */
class ClientTest1 {
    @Test
    fun `operation ok`() {
        val client = Client(ConcretePrototype1())
        assert(client.operation() is ConcretePrototype1)

    }

}

class ClientTest2 {
    @Test
    fun `operation ok`() {
        val client = Client(ConcretePrototype2())
        assert(client.operation() is ConcretePrototype2)

    }

}