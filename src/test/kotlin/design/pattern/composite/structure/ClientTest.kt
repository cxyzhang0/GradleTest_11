package design.pattern.composite.structure

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Sean on 3/5/2017.
 */
class ClientTest {
    @Test
    fun `makeComponent ok`() {
        val client = Client()
        val root = client.makeComponent()

        assertEquals(4, root.numberOfChildren())
        assertEquals(1, (root as Component.Composite).numberOfCompositeChildren())
        assertEquals(3, (root as Component.Composite).numberOfLeafChildren())
        assertEquals(7, (root as Component.Composite).numberOfAllDependents())

    }

}