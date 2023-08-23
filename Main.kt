package mazerunner

fun main() {
    val mazeService = MazeService(10, 10)

    val maze = listOf(
        listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        listOf(0, 0, 1, 0, 1, 0, 1, 0, 0, 1),
        listOf(1, 0, 1, 0, 0, 0, 1, 0, 1, 1),
        listOf(1, 0, 0, 0, 1, 1, 1, 0, 0, 0),
        listOf(1, 0, 1, 0, 0, 0, 0, 0, 1, 1),
        listOf(1, 0, 1, 0, 1, 1, 1, 0, 1, 1),
        listOf(1, 0, 1, 0, 1, 0, 0, 0, 1, 1),
        listOf(1, 0, 1, 0, 1, 1, 1, 0, 1, 1),
        listOf(1, 0, 1, 0, 0, 0, 1, 0, 0, 1),
        listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
    )

    mazeService.setMaze(maze)
    mazeService.printMaze()
}