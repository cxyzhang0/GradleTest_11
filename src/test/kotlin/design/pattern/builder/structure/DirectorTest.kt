package design.pattern.builder.structure

import design.pattern.builder.structure.*
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Sean on 3/2/2017.
 */
class DirectorTest {
    lateinit var builder: ConcreteBuilder
    lateinit var director: Director
    lateinit var product: Product
    @Before
    fun setUp() {
        builder = ConcreteBuilder()
        director = Director(builder)
        product = builder.getResult()
    }
/* equivalent to above?  tests all passed too
    val builder = ConcreteBuilder()
    val director = Director(builder)
    val product = builder.getResult()
*/
    @Test
    fun `before construct ok`() {
        assert(product.partA == null)
        assert(product.partB == null)

    }
    @Test
    fun `after construct ok`() {
        director.construct()
        assert(product.partA!! is PartA)
        assert(product.partB!! is PartB)

    }

}