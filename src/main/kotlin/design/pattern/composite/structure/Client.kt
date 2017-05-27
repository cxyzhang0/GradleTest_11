package design.pattern.composite.structure

/**
 * Created by Sean on 3/5/2017.
 */
class Client {
    fun makeComponent(): Component {
        val root = Component.Composite()
        root.add(Component.Leaf())
        root.add(Component.Leaf())

        val c1 = Component.Composite()
        c1.add(Component.Leaf())
        c1.add(Component.Leaf())
        c1.add(Component.Leaf())

        root.add(c1)

        root.add(Component.Leaf())


        return root
    }
}