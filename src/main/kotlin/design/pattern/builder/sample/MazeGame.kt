package design.pattern.builder.sample

import design.pattern.*
/**
 * Created by Sean on 3/1/2017.
 */
class MazeGame {
    fun createMaze(builder: MazeBuilder): Maze {
        builder.buildMaze()

        builder.buildRoom(1)
        builder.buildRoom(2)

        builder.buildDoor(1, 2)

/*        aMaze.addRoom(room1)
        aMaze.addRoom(room2)

        room1.setSide(Direction.North, factory.makeWall())
        room1.setSide(Direction.East, aDoor)
        room1.setSide(Direction.South, factory.makeWall())
        room1.setSide(Direction.West, factory.makeWall())

        room2.setSide(Direction.North, factory.makeWall())
        room2.setSide(Direction.East, factory.makeWall())
        room2.setSide(Direction.South, factory.makeWall())
        room2.setSide(Direction.West, aDoor)*/

        return builder.getMaze()
    }

    fun createCompleteMaze(builder: MazeBuilder): Maze {
        // TODO: need buildMaze()? Ow, getMaze() may fail
        builder.buildMaze()

        builder.buildRoom(1)
        builder.buildRoom(2)
        builder.buildRoom(3)
        builder.buildRoom(4)
        builder.buildRoom(5)
        return builder.getMaze()
    }

    fun createCountingMaze(builder: MazeBuilder): Maze {
//        builder.buildMaze()

        builder.buildRoom(1)
        builder.buildRoom(2)
        builder.buildRoom(3)
        builder.buildRoom(4)
        builder.buildRoom(5)
        builder.buildRoom(6)

        builder.buildDoor(1, 2)
        builder.buildDoor(3, 4)
        builder.buildDoor(5, 6)
        return builder.getMaze()
    }
}