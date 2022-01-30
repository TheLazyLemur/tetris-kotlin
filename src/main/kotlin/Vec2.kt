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

    // overloading plus function
    operator fun plus(p: Vec2<Float>): Vec2<Float> {
        val newVec = Vec2(0f, 0f)

        val x = this.getX() as Float + p.getX()
        val y = this.getY() as Float + p.getY()

        newVec.setX(x)
        newVec.setY(y)

        return newVec
    }

    operator fun minus(p: Vec2<Float>): Vec2<Float> {
        val newVec = Vec2(0f, 0f)

        val x = this.getX() as Float - p.getX()
        val y = this.getY() as Float - p.getY()

        newVec.setX(x)
        newVec.setY(y)

        return newVec
    }

    override fun toString(): String {
        return "Vec2(x=$x, y=$y)"
    }

}
