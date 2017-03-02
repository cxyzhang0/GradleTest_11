package design.pattern.singleton.sample

import design.pattern.*
/**
 * Created by Sean on 2/27/2017.
 */
class BombedMazeFactory: MazeFactory() {
    override fun makeWall(): Wall {
        return BombedWall()
    }

    override fun makeRoom(roomNo: Int): Room {
        return RoomWithABomb(roomNo)
    }

}