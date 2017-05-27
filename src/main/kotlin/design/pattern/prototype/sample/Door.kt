package design.pattern.prototype.sample

/**
 * Created by Sean on 3/1/2017.
 */

// Q: Is it more reasonable if a door is on a wall?
open class Door(): MapSite() {
    constructor(door: Door): this() {
        // Note: the constructor can access the master's private memebers
        _room1 = door._room1
        _room2 = door._room2
    }
    override fun enter() {
        if (!isOpen) {
            throw Exception("Door closed")
        }
    }

    override fun clone(): Door = Door(this)

    fun initialize(room1: Room, room2: Room) {
        this._room1 = room1
        this._room2 = room2
    }

    val isOpen: Boolean = false

    fun otherSideFrom(room: Room): Room? =
            if (room == _room1) {
                _room2
            }
            else if (room == _room2) {
                _room1
            }
            else {
                null
            }
/**
   Note: because of primary constructor (), we have to use var instead of val
    Also, has to nullable again because of the existence of primary constructor which
    does not initialize them.
*/

    protected var _room1: Room? = null
    protected var _room2: Room? = null
}

class DoorNeedingSpell(): Door() {
    constructor(room1: Room, room2: Room): this() {
        this._room1 = room1
        this._room2 = room2
    }
    constructor(door: DoorNeedingSpell): this() {
        this._room1 = door._room1
        this._room2 = door._room2
    }

    override fun clone() = DoorNeedingSpell(this)

    val hasSpell: Boolean = true
}