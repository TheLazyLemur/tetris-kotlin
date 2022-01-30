import com.raylib.Jaylib.*

class Board(val screenX: Int, val screenY: Int, val width: Int, val height: Int, val cellSize: Int) {
    private class Cell(
    ) {

        private var exists: Boolean = false
        private var color: Color? = null

        fun setColour(color: Color) {
            exists = true
            this.color = color
        }

        fun getColour(): Color? {
            return color
        }

        fun remove() {
            exists = false
        }

    }

    private var cells: MutableList<Cell> = mutableListOf()
    private var padding = 2

    fun initCells() {
        for (y in 0 until 20) {
            for (x in 0 until 10) {
                cells.add(Cell())
            }
        }
    }

    fun setCell(x: Int, y: Int, color: Color) {
        val index = x + y * width
        if (index < cells.size) {
            cells[index].setColour(color)
        }
    }

    fun drawCell(x: Int, y: Int) {
        val c = cells[y * width + x].getColour()
        DrawRectangle(screenX + x * cellSize + padding, screenY + y * cellSize + padding, cellSize - padding, cellSize - padding, c)
    }

    fun draw() {
        for (y in 0 until height) {
            for (x in 0 until width) {
                drawCell(x, y)
            }
        }
    }

}