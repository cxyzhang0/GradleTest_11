package design.pattern.factorymethod.sample

import design.pattern.*
/**
 * Created by Sean on 3/4/2017.
 */
class EnchantedMazeGame: MazeGame() {
    override fun makeRoom(roomNo: Int) = EnchantedRoom(roomNo, castSpell)

    override fun makeDoor(r1: Room, r2: Room) = DoorNeedingSpell(r1, r2)

    private val castSpell = CastSpell()
}