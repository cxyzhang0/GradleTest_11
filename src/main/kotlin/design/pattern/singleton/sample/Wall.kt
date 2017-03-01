package design.pattern.singleton.sample

/**
 * Created by Sean on 2/27/2017.
 */
open class Wall: MapSite() {
    override fun Enter() {
    }
}

class BombedWall: Wall()