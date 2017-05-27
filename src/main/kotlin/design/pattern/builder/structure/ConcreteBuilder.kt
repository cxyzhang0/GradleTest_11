package design.pattern.builder.structure

/**
 * Created by Sean on 3/2/2017.
 */
class ConcreteBuilder: Builder() {
    private val _product = Product()

    override fun buildPartA() {
        _product.partA = PartA()
    }

    override fun buildPartB() {
        _product.partB = PartB()
    }

    fun getResult() = _product
}

class PartA
class PartB

class Product {
    var partA: PartA? = null
    var partB: PartB? = null
}
