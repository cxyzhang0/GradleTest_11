package design.pattern.composite.sample

/**
 * Created by Sean on 3/5/2017.
 */
class Client {
    fun makeEquipment(): Equipment {
        val cabinet = Cabinet("PC Cabinet")

        val chassis = Chassis("PC Chassis")

        cabinet.add(chassis)

        val bus = Bus("MCA Bus")
        bus.add(Card("16Mbs Token Ring"))

        cabinet.add(bus)
        chassis.add(FloppyDisk("3.5in Floppy"))

        return cabinet
    }
}