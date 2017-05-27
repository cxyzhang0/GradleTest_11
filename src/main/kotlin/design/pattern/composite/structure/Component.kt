package design.pattern.composite.structure

/**
 * Created by Sean on 3/5/2017.
 */

sealed class Component {
    class Leaf: Component()
    
    class Composite: Component() {

        fun add(component: Component) {
            if (_components.find{it == component} == null) {
                _components.add(component)
            }
        }

        fun remove(component: Component) {
            _components.remove(component)
        }

        fun getChild(id: Int): Component? = _components[id]

        override fun numberOfChildren(): Int = _components.count()

        fun numberOfLeafChildren(): Int {
            var i: Int = 0
            for (c in _components) {
                i += if (c is Leaf) {1} else {0}
            }
            return i
        }

        fun numberOfCompositeChildren(): Int {
            var i: Int = 0
            for (c in _components) {
                i += if (c is Composite) {1} else {0}
            }
            return i
        }

        fun numberOfAllDependents(): Int {
            var i: Int = 0
            for (c in _components) {
                i += 1 + if (c is Composite) {c.numberOfAllDependents()} else {0}

                // the following is equivalent
/*

                i += when (c) {
                    is Leaf -> 1
                    is Composite -> 1 + c.numberOfAllDependents()
                }
*/

            }

            return i
        }

        override fun operation() {
            for (c in _components) {
               c.operation()
            }
        }
        private val _components: MutableList<Component> = mutableListOf()
    }

    open fun numberOfChildren() = 0

    open fun operation() {
        println("${this.javaClass.toString()}")
    }
}

/*
interface Component {
    fun operation()
    fun add(component: Component)
    fun remove(component: Component)
    fun getChild(id: Int): Component?
}

class Leaf: Component {
    override fun operation() {
        println("Left.operation")
    }
    override fun add(component: Component) {}
    override fun remove(component: Component) {}
    override fun getChild(id: Int): Component? = null
}

class Composite: Component {
    override fun operation() {
        println("Composite.operation")
    }
    override fun add(component: Component) {
        components.add(component)
    }

    override fun remove(component: Component) {
        components.remove(component)
    }

    override fun getChild(id: Int): Component? = components[id]

    private val components: MutableList<Component> = mutableListOf()
}*/
