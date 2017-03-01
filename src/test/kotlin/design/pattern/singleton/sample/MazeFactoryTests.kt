package design.pattern.singleton.sample

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Created by Sean on 2/27/2017.
 * first set mazeStyle = "default" in MazeFactory.kt
 */


class MazeFactoryTests {
    lateinit var factory: MazeFactory
    @Before
    fun setUp() {
        factory = MazeFactory.instance("default")
    }

    @Test
    fun `makeMaze ok`() {
        var maze = factory.makeMaze()

/*
        var expected = Maze::class.toString()
        var actual = maze.javaClass.toString()
        println("expected: $expected; actual: $actual")
        assert(expected.contains(actual))
*/

        assert(maze is Maze)
    }

    @Test
    fun `makeWall ok`() {
        var wall = factory.makeWall()
        assert(wall is Wall)
    }

    @Test
    fun `makeRoom ok`() {
        var room = factory.makeRoom(1)
        assert(room is Room)
    }

    @Test
    fun `makeDoor ok`() {
        var door = factory.makeDoor(Room(1), Room(2))
        assert(door is Door)
    }

}