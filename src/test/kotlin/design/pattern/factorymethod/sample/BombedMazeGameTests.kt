package design.pattern.factorymethod.sample

import org.junit.Assert.*
import org.junit.Test

import design.pattern.*
/**
 * Created by Sean on 3/4/2017.
 */

class BombedMazeGameTests {
    @Test
    fun `createMaze ok`() {
        val game = BombedMazeGame()
        val maze = game.createMaze()

        assert(maze.getRoomByRoomNo(1) is RoomWithABomb)
        assert(maze.getRoomByRoomNo(2) is RoomWithABomb)

        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is BombedWall)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.East) is Door)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.South) is BombedWall)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.West) is BombedWall)

        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.North) is BombedWall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.East) is BombedWall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.South) is BombedWall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is Door)

    }

}