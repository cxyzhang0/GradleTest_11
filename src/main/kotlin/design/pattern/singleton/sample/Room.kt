package design.pattern.singleton.sample

/**
 * Created by Sean on 2/27/2017.
*/
open class Room(val roomNo: Int): MapSite() {
//    constructor (roomNo: Int, s0: Int): this(roomNo) { s = s0}
//    init {s = 1}
    override fun Enter() {}

    fun getSite(direction: Direction): MapSite? {
        return _sides[direction]
    }

    fun setSide(direction: Direction, mapSite: MapSite) {
        _sides[direction] = mapSite

/*
        if (_sides == null) {
            _sides = mutableMapOf()
        }
        if (_sides!![direction] == null) {
            _sides!![direction] = mapSite
        }
        else {
            _sides!![direction] = mapSite
        }
*/

    }


    private val _sides: MutableMap<Direction, MapSite> = mutableMapOf()// null //mapOf(Direction.East to null, Direction.North to MapSite(), Direction.South to MapSite(), Direction.West to MapSite())
}

class EnchantedRoom(roomNo: Int, castSpell: CastSpell): Room(roomNo)

class CastSpell

class RoomWithABomb(roomNo: Int): Room(roomNo)

/*
* This shows a read-only property (val) does not have to have an initializer if it is initialized in the constructor (init for primary constructor)
* */
class TestProperty(s0: Int, s1: Int?) {
    val s: Int
    val ss: Int?
    init {
        s = s0
        ss = s1
    }
    constructor(s0: Int, s1: Int?, s2: String): this(s0, s1) {
        println("s2 $s2")
    }

}
