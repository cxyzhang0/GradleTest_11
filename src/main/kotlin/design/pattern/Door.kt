package design.pattern

/**
 * Created by Sean on 3/1/2017.
 */
open class Door(val room1: Room, val room2: Room): MapSite() {
    override fun Enter() {
        if (!isOpen) {
            throw Exception("Door closed")
        }
    }

    val isOpen: Boolean = false

    fun otherSide(room: Room): Room? =
            if (room == room1) {
                room2
            }
            else if (room == room2) {
                room1
            }
            else {
                null
            }
}

class DoorNeedingSpell(room1: Room, room2: Room): Door(room1, room2)