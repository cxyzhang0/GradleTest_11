package design.pattern.singleton.sample

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