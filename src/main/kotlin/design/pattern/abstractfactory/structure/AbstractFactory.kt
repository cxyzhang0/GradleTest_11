package design.pattern.abstractfactory.structure

/**
 * Created by Sean on 3/2/2017.
 */
abstract class AbstractFactory {
    abstract fun createProductA(): AbstractProductA
    abstract fun createProductB(): AbstractProductB


}

abstract class AbstractProductA
abstract class AbstractProductB
