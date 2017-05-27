package design.pattern

/**
 * Created by Sean on 3/1/2017.
 */

// Q: Is it more reasonable if a door is on a wall?
open class Door(var room1: Room, var room2: Room): MapSite() {
    override fun enter() {
        if (!isOpen) {
            throw Exception("Door closed")
        }
    }

    val isOpen: Boolean = false

    fun otherSideFrom(room: Room): Room? =
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

class DoorNeedingSpell(room1: Room, room2: Room): Door(room1, room2) {
    val hasSpell: Boolean = true
}