package design.pattern.prototype.structure

/**
 * Created by Sean on 3/4/2017.
 */
class Client(private val p: Prototype) {
    fun operation() = p.clone()

}