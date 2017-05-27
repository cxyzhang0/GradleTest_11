package design.pattern.abstractfactory.structure

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Created by Sean on 3/2/2017.
 */
class ClientTests1 {
    lateinit var client: Client
    @Before
    fun setUp() {
        client = Client(ConcreteFactory1())
    }
    @Test
    fun `createProductA ok`() {
        assert(client.createProductA() is ProductA1)
    }

    @Test
    fun `createProductB ok`() {
        assert(client.createProductB() is ProductB1)
    }

/*
    @Test
    fun `getFactory ok`() {
        assert(client.factory is ConcreteFactory1)
    }
*/

}

class ClientTests2 {
    lateinit var client: Client
    @Before
    fun setUp() {
        client = Client(ConcreteFactory2())
    }
    @Test
    fun `createProductA ok`() {
        assert(client.createProductA() is ProductA2)
    }

    @Test
    fun `createProductB ok`() {
        assert(client.createProductB() is ProductB2)
    }

/*
    @Test
    fun `getFactory ok`() {
        assert(client.factory is ConcreteFactory2)
    }
*/

}