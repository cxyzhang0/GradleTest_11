package design.pattern.singleton.structure

import org.junit.Assert
import org.junit.Test


/**
 * Created by Sean on 2/25/2017.
 */
class SingletonTests {
    @Test
    fun `operation1 ok`() {
        Assert.assertEquals(3, Singleton.operation1(1, 2))
    }
    @Test
    fun `operation2 ok`() {
        Assert.assertEquals(6, Singleton.operation2(2, 3))
    }

}