package design.pattern.builder.sample

import design.pattern.*
/**
 * Created by Sean on 3/3/2017.
 */
interface MazeBuilder {
    fun buildMaze()
    fun buildRoom(roomNo: Int)
    /**
     * Note: buildRoom has a different signature from MakeRoom which takes Room instead of Int as parameters
     *
     */
    fun buildDoor(roomFromNo: Int, roomToNo: Int)
    fun getMaze(): Maze

}