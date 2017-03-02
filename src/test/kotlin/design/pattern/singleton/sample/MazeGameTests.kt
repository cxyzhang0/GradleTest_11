package design.pattern.singleton.sample

import design.pattern.*
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by Sean on 3/1/2017.
 */
class MazeGameTests {
    @Test
    fun `default maze ok`() {
        var factory = MazeFactory.instance("default")
        var maze = MazeGame().createMaze(factory)

        assert(maze.getRoomByRoomNo(1) is Room)
        assert(maze.getRoomByRoomNo(2) is Room)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is Door)
    }

    @Test
    fun `bombed maze ok`() {
        var factory = MazeFactory.instance("bombed")
        var maze = MazeGame().createMaze(factory)

        assert(maze.getRoomByRoomNo(1) is RoomWithABomb)
        assert(maze.getRoomByRoomNo(2) is RoomWithABomb)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is BombedWall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is Door)
    }

    @Test
    fun `enchanted maze ok`() {
        var factory = MazeFactory.instance("enchanted")
        var maze = MazeGame().createMaze(factory)

        assert(maze.getRoomByRoomNo(1) is EnchantedRoom)
        assert(maze.getRoomByRoomNo(2) is EnchantedRoom)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is DoorNeedingSpell)
    }
}