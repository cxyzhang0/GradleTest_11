package design.pattern.abstractfactory.structure

/**
 * Created by Sean on 3/2/2017.
 */
class Client(private val factory: AbstractFactory) {
    fun createProductA(): AbstractProductA = factory.createProductA()
    fun createProductB(): AbstractProductB = factory.createProductB()
}