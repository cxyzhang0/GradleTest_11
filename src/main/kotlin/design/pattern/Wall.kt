package design.pattern

import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by Sean on 3/1/2017.
 */
open class Wall: MapSite() {
    override fun enter() {}
}

class BombedWall: Wall() {
    val hasBomb: Boolean = true
}