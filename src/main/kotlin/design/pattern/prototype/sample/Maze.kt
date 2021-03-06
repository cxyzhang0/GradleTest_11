package design.pattern.prototype.sample

/**
 * Created by Sean on 3/1/2017.
 */
class Maze {
    fun addRoom(room: Room) {
//        if (rooms.find{it == room} == null) {
//            rooms.add(room)
//        }
        rooms[room.roomNo] = room
    }

    fun getRoomByRoomNo(roomNo: Int): Room? {
        return rooms[roomNo] //rooms.find{it.roomNo == roomNo }
    }
    //    private val rooms: MutableList<Room> = mutableListOf()
    private val rooms: MutableMap<Int, Room> = mutableMapOf()
}