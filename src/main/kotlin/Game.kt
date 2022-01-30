import com.raylib.Jaylib
import com.raylib.Jaylib.*

class Game (width: Int, height: Int, fps: Int, title: String) {

    val board = Board(200,200,10,20, 15)

    init {
        assert(!IsWindowReady())
        InitWindow(width, height, title)
        SetTargetFPS(fps)

        board.initCells()

        for (y in 0 until 20) {
            for (x in 0 until 10) {
                board.setCell(x,y, Jaylib.Color(255,255,255,255))
            }
        }
    }

    var sameShouldClose = false


    fun tick(){
        BeginDrawing()
        update()
        draw()
        EndDrawing()
    }

    private fun draw(){
        ClearBackground(BLACK)
        board.draw()
    }

    private fun update(){
    }

    fun kill(){
        assert(IsWindowReady())
        CloseWindow()
    }
}