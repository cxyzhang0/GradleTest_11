package design.pattern.singleton.sample

import design.pattern.*
import org.junit.Test
import org.junit.Assert.*


/**
 * Created by Sean on 2/27/2017.
 */
class StructuresTests {
    @Test fun `getColorFromString ok`() {
        assertEquals(Color.RED, getColorFromString("RED"))
        assertEquals(Color.BLUE, getColorFromString("BLUE"))
        assertEquals(Color.GREEN, getColorFromString("GREEN"))
    }

    @Test fun `getColorRGB ok`() {
        assertEquals(Color.RED.rgb, getColorRGB("RED"))
        assertEquals(Color.BLUE.rgb, getColorRGB("BLUE"))
        assertEquals(Color.GREEN.rgb, getColorRGB("GREEN"))
    }

    @Test fun `map assignment ok`() {
        var map: MutableMap<String, Int> = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
        assertEquals(2, map["b"])
        map["b"] = 21
        assertEquals(21, map["b"])
        map["d"] = 4
        assertEquals(4, map["d"])
        assertEquals(null, map["e"])

    }
}