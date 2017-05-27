package design.pattern.abstractfactory.structure

/**
 * Created by Sean on 3/2/2017.
 */

class ConcreteFactory2: AbstractFactory() {
    override fun createProductA(): AbstractProductA = ProductA2()
    override fun createProductB(): AbstractProductB = ProductB2()
}

class ProductA2: AbstractProductA()
class ProductB2: AbstractProductB()
