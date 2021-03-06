package design.pattern

/**
 * Created by Sean on 3/1/2017.
 */
enum class Direction {
    North, South, East, West
}

/**
 * This exposes, for example, Color.RED.rgb
 */
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun getColorFromString(colorString: String): Color {
    return Color.valueOf(colorString)
}

fun getColorRGB(colorString: String): Int {

    return Color.valueOf(colorString).rgb

}