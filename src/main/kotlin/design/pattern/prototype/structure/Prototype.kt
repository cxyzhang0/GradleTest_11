package design.pattern.prototype.structure

/**
 * Created by Sean on 3/4/2017.
 */
abstract class Prototype {
    abstract fun clone(): Prototype
}

class ConcretePrototype1: Prototype() {
    override fun clone() = ConcretePrototype1()
}

class ConcretePrototype2: Prototype() {
    override fun clone() = ConcretePrototype2()
}