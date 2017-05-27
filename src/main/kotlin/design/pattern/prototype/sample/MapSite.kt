package design.pattern.prototype.sample

/**
 * Created by Sean on 2/27/2017.
 */
abstract class MapSite {
    abstract fun enter()
    abstract fun clone(): MapSite // to support prototype pattern
}