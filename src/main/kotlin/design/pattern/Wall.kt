package design.pattern

/**
 * Created by Sean on 3/1/2017.
 */
open class Wall: MapSite() {
    override fun Enter() {
    }
}

class BombedWall: Wall()