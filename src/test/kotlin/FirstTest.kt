/**
 * Created by Sean on 2/24/2017.
 */
package learn

import org.junit.Test
import org.junit.Assert.*

/**
 * This package level test function cannot be found.
 *
 */
/*@Test fun `package level test Ok`() {
    assert(true)
}*/

class MyTest {
    @Test fun `testOk`() {
        assertFalse(false)
//        badFunction()
    }
//    fun badFunction(): Nothing = throw Exception("Bad")
}