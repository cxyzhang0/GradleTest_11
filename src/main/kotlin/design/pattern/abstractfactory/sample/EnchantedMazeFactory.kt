package design.pattern.abstractfactory.sample

import design.pattern.*
/**
 * Created by Sean on 3/2/2017.
 */
class EnchantedMazeFactory: MazeFactory() {
    override fun makeRoom(roomNo: Int): Room {
        return EnchantedRoom(roomNo, castSpell)
    }

    override fun makeDoor(room1: Room, room2: Room): Door {
        return DoorNeedingSpell(room1, room2)
    }

    private val castSpell: CastSpell = CastSpell()
}