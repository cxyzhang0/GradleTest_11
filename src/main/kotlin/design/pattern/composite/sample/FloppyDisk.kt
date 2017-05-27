package design.pattern.composite.sample

/**
 * Created by Sean on 3/6/2017.
 */
class FloppyDisk(name: String): Equipment(name) {
    override fun power() = 1
    override fun netPrice() = (1.0).toDouble()
    override fun discountPrice() = (0.5).toDouble()

}