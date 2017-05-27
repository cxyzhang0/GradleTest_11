package design.pattern.factorymethod.structure

/**
 * Created by Sean on 3/4/2017.
 */
abstract class Creator {
    abstract fun factoryMethod(): Product

    fun anOperation() = factoryMethod()
}

class ConcreteCreator: Creator() {
    override fun factoryMethod(): Product = ConcreteProduct()
}