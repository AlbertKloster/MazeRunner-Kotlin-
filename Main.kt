package mazerunner

fun main() {
    println("Please, enter the size of a maze")
    val (height, width) = readln().split(" ").map { it.toInt() }

    val mazeService = MazeService(width, height)

    mazeService.printMaze()

}