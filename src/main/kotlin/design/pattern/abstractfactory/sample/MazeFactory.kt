package design.pattern.abstractfactory.sample

/**
 * Created by Sean on 3/2/2017.
 */
import design.pattern.*
/**
 * Singleton
 * Created by Sean on 2/27/2017.
 * Use class instead of object because it will have subclasses
 * Use open instead of abstract because of its constructor
 * protected instead of private constructor so that subclass can initialize
 * we have a singleton for each mazeStyle: default, bombed, and enchanted, lazy loading
 */

open class MazeFactory {

    open fun makeMaze(): Maze {
        return Maze()
    }

    open fun makeWall(): Wall {
        return Wall()
    }

    open fun makeRoom(roomNo: Int): Room {
        return Room(roomNo)
    }

    open fun makeDoor(room1: Room, room2: Room): Door {
        return Door(room1, room2)
    }
}
