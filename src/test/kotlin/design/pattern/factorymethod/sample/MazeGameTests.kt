package design.pattern.factorymethod.sample

import org.junit.Test

import org.junit.Assert.*

import design.pattern.*
/**
 * Created by Sean on 3/4/2017.
 */
class MazeGameTests {
    @Test
    fun `createMaze ok`() {
        val game = MazeGame()
        val maze = game.createMaze()

        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.East) is Door)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.South) is Wall)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.West) is Wall)

        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.East) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.South) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is Door)

    }

}