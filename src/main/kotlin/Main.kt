import com.raylib.Jaylib.*

fun main() {
    val game = Game(800, 600, 60, "Test Game")

    while (!WindowShouldClose()) {
        game.tick()
    }

    game.kill()
}