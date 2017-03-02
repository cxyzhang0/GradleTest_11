package design.pattern.singleton.sample

import design.pattern.*
/**
 * Created by Sean on 3/1/2017.
 */
class MazeGame {
    fun createMaze(factory: MazeFactory): Maze {
        var aMaze: Maze = factory.makeMaze()
        var room1: Room = factory.makeRoom(1)
        var room2: Room = factory.makeRoom(2)

        var aDoor: Door = factory.makeDoor(room1, room2)

        aMaze.addRoom(room1)
        aMaze.addRoom(room2)

        room1.setSide(Direction.North, factory.makeWall())
        room1.setSide(Direction.East, aDoor)
        room1.setSide(Direction.South, factory.makeWall())
        room1.setSide(Direction.West, factory.makeWall())

        room2.setSide(Direction.North, factory.makeWall())
        room2.setSide(Direction.East, factory.makeWall())
        room2.setSide(Direction.South, factory.makeWall())
        room2.setSide(Direction.West, aDoor)

        return aMaze
    }
}