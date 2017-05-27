package design.pattern.builder.sample

import org.junit.Test

import org.junit.Assert.*

import design.pattern.*
/**
 * Created by Sean on 3/4/2017.
 */
class MazeGameTests {
    @Test
    fun `createMaze ok`() {
        val builder = StandardMazeBuilder()
        val game = MazeGame()
        val maze = game.createMaze(builder)
        assert(maze.getRoomByRoomNo(1) is Room)
        assert(maze.getRoomByRoomNo(2) is Room)
        assert(maze.getRoomByRoomNo(3) == null)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.East) is Door)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.West) is Wall)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(1)?.getSite(Direction.South) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.West) is Door)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.East) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.North) is Wall)
        assert(maze.getRoomByRoomNo(2)?.getSite(Direction.South) is Wall)

    }

    @Test
    fun `createCompleteMaze ok`() {
        val builder = StandardMazeBuilder()
        val game = MazeGame()
        val maze = game.createCompleteMaze(builder)
        assert(maze.getRoomByRoomNo(1) is Room)
        assert(maze.getRoomByRoomNo(2) is Room)
        assert(maze.getRoomByRoomNo(3) is Room)
        assert(maze.getRoomByRoomNo(4) is Room)
        assert(maze.getRoomByRoomNo(5) is Room)
        assert(maze.getRoomByRoomNo(6) == null)

    }

    @Test
    fun `createCountingMaze ok`() {
        val builder = CountingMazeBuilder()
        val game = MazeGame()
        val maze = game.createCountingMaze(builder)

        val roomCount = builder.getRoomCounts()
        val doorCount = builder.getDoorCounts()

        assertEquals(roomCount, 6)
        assertEquals(doorCount, 3)

    }

}