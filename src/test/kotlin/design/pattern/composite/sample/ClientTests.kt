package design.pattern.composite.sample

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Sean on 3/6/2017.
 */
class ClientTests {
    @Test
    fun `makeEquipment ok`() {
        val client = Client()
        val cabinet = client.makeEquipment()

        assertEquals(cabinet.name, "PC Cabinet")
        assertEquals(cabinet.power(), 20)
        assertEquals(cabinet.netPrice().toInt(), 20)
        assertEquals(cabinet.discountPrice().toInt(), 10)

    }

}