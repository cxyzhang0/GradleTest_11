package design.pattern.singleton.sample

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
/**
 * Created by Sean on 2/28/2017.
 * first set mazeStyle = "bombed" in MazeFactory.kt*
 */
class BombedMazeFactoryTests {
    lateinit var factory: MazeFactory
    @Before
    fun setUp() {
        factory = MazeFactory.instance("bombed")
    }

    @Test
    fun `makeWall ok`() {
        var wall = factory.makeWall()
/*
        var expected = BombedWall::class.toString()
        var actual = wall.javaClass.toString()
        println("expected: $expected; actual: $actual")
        assert(expected.contains(actual))
*/
        assert(wall is BombedWall)
    }

    @Test
    fun `makeRoom ok`() {
        var room = factory.makeRoom(1)
/*
        var expected = RoomWithABomb::class.toString()
        var actual = room.javaClass.toString()
        println("expected: $expected; actual: $actual")
        assert(expected.contains(actual))
*/

        assert(room is RoomWithABomb)
    }

}