package design.pattern.composite.sample

/**
 * Created by Sean on 3/6/2017.
 */
abstract class Equipment(val name: String) {
    open fun power(): Int = 0

    open fun netPrice(): Double = (0.0).toDouble()

    open fun discountPrice(): Double = (0.0).toDouble()

    open fun add(equipment: Equipment) {}

    open fun remove(equipment: Equipment) {}

}