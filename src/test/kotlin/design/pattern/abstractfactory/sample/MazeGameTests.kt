package design.pattern.abstractfactory.sample

import design.pattern.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by Sean on 3/1/2017.
 */
class MazeGameTests_Default {
    @Test
    fun `default maze ok`() {
        val mazeGame = MazeGame()
        val factory = MazeFactory()
        val maze = MazeGame().createMaze(factory)

        assert(maze.getRoomByRoomNo(1) is Room)
        assert(maze.getRoomByRoomNo(2) is Room)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is Door)
    }

}
class MazeGameTests_Bombed {
    @Test
    fun `bombed maze ok`() {
        val mazeGame = MazeGame()
        val factory = BombedMazeFactory()
        val maze = mazeGame.createMaze(factory)

        assert(maze.getRoomByRoomNo(1) is RoomWithABomb)
        assert(maze.getRoomByRoomNo(2) is RoomWithABomb)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is BombedWall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is Door)
    }

}
class MazeGameTests_Enchanted {
    @Test
    fun `enchanted maze ok`() {
        val mazeGame = MazeGame()
        val factory = EnchantedMazeFactory()
        val maze = mazeGame.createMaze(factory)

        assert(maze.getRoomByRoomNo(1) is EnchantedRoom)
        assert(maze.getRoomByRoomNo(2) is EnchantedRoom)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is DoorNeedingSpell)
    }
}
