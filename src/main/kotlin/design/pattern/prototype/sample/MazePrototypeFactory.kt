package design.pattern.prototype.sample

import design.pattern.abstractfactory.sample.*
import java.util.*

/**
 * Created by Sean on 3/4/2017.
 * Note: MazePrototypeFactory has not primary constructor
 * Note: Different from the book, our MazePrototypeFactory is not a subclass of AbstractFactory
 *  because the component classes are different, e.g. Door here is different from design.pattern.Door.
 */
class MazePrototypeFactory {
    constructor(prototypeMaze: Maze,
                prototypeWall: Wall,
                prototypeRoom: Room,
                prototypeDoor: Door
                ) {
        _prototypeMaze = prototypeMaze
        _prototypeWall = prototypeWall
        _prototypeRoom = prototypeRoom
        _prototypeDoor = prototypeDoor
    }

    fun makeMaze(): Maze {
        return Maze()
    }

    fun makeWall(): Wall {
        val wall = _prototypeWall.clone()
        wall.initialize()
        return wall
    }

    fun makeDoor(r1: Room, r2: Room): Door {
        val door = _prototypeDoor.clone()
        door.initialize(r1, r2)
        return door
    }

    fun makeRoom(roomNo: Int): Room {
        val room = _prototypeRoom.clone()
        room.initialize(roomNo)
        return room
    }

    private val _prototypeMaze: Maze
    private val _prototypeWall: Wall
    private val _prototypeRoom: Room
    private val _prototypeDoor: Door
}

