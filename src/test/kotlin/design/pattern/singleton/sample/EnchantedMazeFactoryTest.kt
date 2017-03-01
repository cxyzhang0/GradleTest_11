package design.pattern.singleton.sample

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Created by Sean on 2/28/2017.
 * first set mazeStyle = "enchanted" in MazeFactory.kt*
 *
 */
class EnchantedMazeFactoryTest {
    lateinit var factory: MazeFactory
    @Before
    fun setUp() {
        factory = MazeFactory.instance("enchanted")
    }

    @Test
    fun `makeRoom ok`() {
        var room = factory.makeRoom(1)
/*
        var expected = EnchantedRoom::class.toString()
        var actual = room.javaClass.toString()
        println("expected: $expected; actual: $actual")
        assert(expected.contains(actual))
*/

        assert(room is EnchantedRoom)
    }

    @Test
    fun `makeDoor ok`() {
        var door = (factory as EnchantedMazeFactory).makeDoor(EnchantedRoom(1, CastSpell()), EnchantedRoom(2, CastSpell()))
        assert(door is DoorNeedingSpell)
    }

}