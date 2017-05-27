package design.pattern.prototype.sample

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Sean on 3/5/2017.
 */
class MazeGameTests {
    @Test
    fun `createMaze ok`() {
        val game = MazeGame()
        val factory = MazePrototypeFactory(
                Maze(),
                Wall(),
                Room(),
                Door()
        )

        val maze = game.createMaze(factory)

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
        val factory = MazePrototypeFactory(
                Maze(),
                BombedWall(),
                RoomWithABomb(),
                Door()
        )
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
        val factory = MazePrototypeFactory(
                Maze(),
                Wall(),
                EnchantedRoom(),
                DoorNeedingSpell()
        )
        val maze = mazeGame.createMaze(factory)

        assert(maze.getRoomByRoomNo(1) is EnchantedRoom)
        assert(maze.getRoomByRoomNo(2) is EnchantedRoom)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is DoorNeedingSpell)
    }
}
