package design.pattern.builder.sample

import design.pattern.*

/**
 * Created by Sean on 3/3/2017.
 */
class StandardMazeBuilder: MazeBuilder {
    override fun buildMaze(){
        _currentMaze = Maze()
    }
    override fun buildRoom(roomNo: Int){
        if (_currentMaze?.getRoomByRoomNo(roomNo) == null) {
            var room = Room(roomNo)
            _currentMaze?.addRoom(room)

            room.setSide(Direction.North, Wall())
            room.setSide(Direction.South, Wall())
            room.setSide(Direction.East, Wall())
            room.setSide(Direction.West, Wall())
        }
    }
    override fun buildDoor(roomFromNo: Int, roomToNo: Int){
        var room1 = _currentMaze?.getRoomByRoomNo(roomFromNo)!!
        var room2 = _currentMaze?.getRoomByRoomNo(roomToNo)!!
        var door = Door(room1, room2)

        room1.setSide(commonWall(room1, room2), door)
        room2.setSide(commonWall(room2, room1), door)
    }

    override fun getMaze(): Maze {
        return _currentMaze!!
    }
/**
 * TODO: the two rooms are not adjacent to each other
 *
 */
    private fun commonWall(room1: Room, room2: Room): Direction =
        if (room1.roomNo < room2.roomNo) {
            Direction.East
        }
        else {
            Direction.West
        }

        private var _currentMaze: Maze? = null
}