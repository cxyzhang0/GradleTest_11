package design.pattern.singleton.sample

/**
 * Created by Sean on 2/27/2017.
 */
class EnchantedMazeFactory: MazeFactory() {
    override fun makeRoom(roomNo: Int): Room {
        return EnchantedRoom(roomNo, CastSpell())
    }

    override fun makeDoor(room1: Room, room2: Room): Door {
        return DoorNeedingSpell(room1, room2)
    }

    private val castSpell: CastSpell = CastSpell()
}