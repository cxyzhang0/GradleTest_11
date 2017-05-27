package design.pattern.abstractfactory.sample

/**
 * Created by Sean on 3/2/2017.
 */
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