package design.pattern.prototype.sample

/**
 * Created by Sean on 3/1/2017.
 */
open class Wall(): MapSite() {
    constructor(wall: Wall): this()

    override fun enter() {}

    override fun clone() = Wall(this)

    fun initialize() {}
}

/**
 * No primary constructor, all secondary constructors initialize Supertype
 */
class BombedWall: Wall {
    constructor(): super()
    constructor(wall: BombedWall): super(wall)

    override fun clone() = BombedWall(this)

    val hasBomb: Boolean = true

}