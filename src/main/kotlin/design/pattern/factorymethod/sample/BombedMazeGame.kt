package design.pattern.factorymethod.sample

import design.pattern.*
/**
 * Created by Sean on 3/4/2017.
 */
class BombedMazeGame: MazeGame() {
    override fun makeWall() = BombedWall()

    override fun makeRoom(roomNo: Int) = RoomWithABomb(roomNo)

}