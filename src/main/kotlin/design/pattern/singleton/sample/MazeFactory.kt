package design.pattern.singleton.sample

import design.pattern.*
/**
 * Singleton
 * Created by Sean on 2/27/2017.
 * Use class instead of object because it will have subclasses
 * Use open instead of abstract because of its constructor
 */

//var mazeStyle: String = "enchanted" // "enchanted" "default" "bombed"

open class MazeFactory protected constructor() {
    companion object {
        private var _instance_Default: MazeFactory? = null
        private var _instance_Enchanted: EnchantedMazeFactory? = null
        private var _instance_Bombed: BombedMazeFactory? = null
        fun instance(mazeStyle: String): MazeFactory {
            if (mazeStyle.contains("bombed")) {
                if (_instance_Bombed == null) {
                    _instance_Bombed = BombedMazeFactory()
                }
                return _instance_Bombed!!
            }
            else if (mazeStyle.contains("enchanted")) {
                if (_instance_Enchanted == null) {
                    _instance_Enchanted = EnchantedMazeFactory()
                }
                return _instance_Enchanted!!
            }
            else {
                if (_instance_Default == null) {
                    _instance_Default = MazeFactory()
                }
                return _instance_Default!!
            }
        }
    }

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

