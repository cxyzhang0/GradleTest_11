package design.pattern.builder.sample

import design.pattern.*
/**
 * Created by Sean on 3/4/2017.
 */
class CountingMazeBuilder: MazeBuilder {
    override fun buildMaze() {}

    override fun buildRoom(roomNo: Int) {
        _rooms++
    }

    override fun buildDoor(roomNo1: Int, roomNo2: Int) {
        _doors++
    }

    override fun getMaze(): Maze {
        return Maze()
    }

    fun getDoorCounts(): Int = _doors
    fun getRoomCounts(): Int = _rooms

    private var _doors: Int = 0
    private var _rooms: Int = 0
}