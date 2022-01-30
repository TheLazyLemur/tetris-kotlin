class Vec2<T>(private var x: T, private var y: T) {

    fun getX(): T {
        return x
    }

    fun getY(): T {
        return y
    }

    fun setX(x: T) {
        this.x = x
    }

    fun setY(y: T) {
        this.y = y
    }

    operator fun plus(p: Vec2<Float>): Vec2<Float> {
        return Vec2(this.getX() as Float + p.getX(), this.getY() as Float + p.getY())
    }

    operator fun minus(p: Vec2<Float>): Vec2<Float> {
        return Vec2(this.getX() as Float - p.getX(), this.getY() as Float - p.getY())
    }

    override fun toString(): String {
        return "Vec2(x=$x, y=$y)"
    }

}
