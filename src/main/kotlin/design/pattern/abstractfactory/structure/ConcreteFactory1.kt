package design.pattern.abstractfactory.structure

/**
 * Created by Sean on 3/2/2017.
 */
class ConcreteFactory1: AbstractFactory() {
    override fun createProductA(): AbstractProductA = ProductA1()
    override fun createProductB(): AbstractProductB = ProductB1()
}

class ProductA1: AbstractProductA()
class ProductB1: AbstractProductB()

