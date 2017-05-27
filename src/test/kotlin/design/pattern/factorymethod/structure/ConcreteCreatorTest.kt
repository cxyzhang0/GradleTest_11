package design.pattern.factorymethod.structure

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Sean on 3/4/2017.
 */
class ConcreteCreatorTest {
    @Test
    fun `factoryMethod ok`() {
        val concreteCreator = ConcreteCreator()
        assert(concreteCreator.anOperation() is ConcreteProduct)

    }

}