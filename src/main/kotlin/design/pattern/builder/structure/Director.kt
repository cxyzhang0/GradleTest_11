package design.pattern.builder.structure

/**
 * Created by Sean on 3/2/2017.
 */
class Director(private val builder: Builder) {
    fun construct() {
        builder.buildPartA()
        builder.buildPartB()
    }
}