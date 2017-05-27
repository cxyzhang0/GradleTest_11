package design.pattern.prototype.sample

/**
 * Created by Sean on 3/1/2017.
 */
//open class Room(val roomNo: Int): MapSite() {
open class Room(): MapSite() {
    constructor(room: Room): this() {
        this.roomNo = room.roomNo
    }

    fun initialize(roomNo: Int) {
        this.roomNo = roomNo
    }

    override fun clone() = Room(this)

    override fun enter() {}


    fun getSite(direction: Direction): MapSite? {
        return _sides[direction]
    }

    fun setSide(direction: Direction, mapSite: MapSite) {
        _sides[direction] = mapSite
    }

    var roomNo: Int = 0
    private val _sides: MutableMap<Direction, MapSite> = mutableMapOf()// null //mapOf(Direction.East to null, Direction.North to MapSite(), Direction.South to MapSite(), Direction.West to MapSite())
}

class EnchantedRoom(): Room() {
    constructor(roomNo: Int): this() {
        this.roomNo = roomNo
    }
    constructor(room: Room): this(room.roomNo)

    override fun clone() = EnchantedRoom(this)

    private val spell = CastSpell()
}

class CastSpell

class RoomWithABomb(): Room() {
    constructor(roomNo: Int): this() {
        this.roomNo = roomNo
    }
    constructor(room: Room): this(room.roomNo)

    override fun clone() = RoomWithABomb(this)

    val hasBomb = true

}


/*
* This shows a read-only property (val) does not have to have an initializer if it is initialized in the primary constructor (init for primary constructor)
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
