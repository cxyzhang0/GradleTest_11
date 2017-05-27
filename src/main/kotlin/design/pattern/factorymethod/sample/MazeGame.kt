package design.pattern.factorymethod.sample

import design.pattern.*
/**
 * Created by Sean on 3/4/2017.
 */
open class MazeGame {
    fun createMaze(): Maze {
        val aMaze = makeMaze()

        val r1 = makeRoom(1)
        val r2 = makeRoom(2)
        val theDoor = makeDoor(r1, r2)

        aMaze.addRoom(r1)
        aMaze.addRoom(r2)

        r1.setSide(Direction.North, makeWall())
        r1.setSide(Direction.East, theDoor)
        r1.setSide(Direction.South, makeWall())
        r1.setSide(Direction.West, makeWall())

        r2.setSide(Direction.North, makeWall())
        r2.setSide(Direction.East, makeWall())
        r2.setSide(Direction.South, makeWall())
        r2.setSide(Direction.West, theDoor)

        return aMaze
    }

    // factory methods:

    open fun makeMaze() = Maze()

    open fun makeRoom(roomNo: Int) = Room(roomNo)

    open fun makeWall() = Wall()

    open fun makeDoor(r1: Room, r2: Room) = Door(r1, r2)

}