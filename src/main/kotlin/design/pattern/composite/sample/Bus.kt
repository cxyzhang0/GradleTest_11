package design.pattern.composite.sample

/**
 * Created by Sean on 3/6/2017.
 */
class Bus(name: String): CompositeEquipment(name) {
    override fun power() = _multiplier * super.power()

    override fun netPrice() = _multiplier * super.netPrice()

    override fun discountPrice() = _multiplier *  super.discountPrice()

    private val _multiplier = 2
}