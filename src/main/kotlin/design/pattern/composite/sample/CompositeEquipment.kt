package design.pattern.composite.sample

/**
 * Created by Sean on 3/6/2017.
 */
open class CompositeEquipment(name: String): Equipment(name) {

    override fun power() = _equipments.sumBy{ it.power() }

    override fun netPrice(): Double = _equipments.sumByDouble { it.netPrice() }

    override fun discountPrice(): Double = _equipments.sumByDouble { it.discountPrice() }

    override fun add(equipment: Equipment) { _equipments.add(equipment) }

    override fun remove(equipment: Equipment) { _equipments.remove(equipment) }

    private val _equipments: MutableList<Equipment> = mutableListOf()
}