package mazerunner

import java.util.Random

class MazeService(private val width: Int, private val height: Int) {

    init {
        initMaze()
    }

    private fun initMaze() {
        Maze.setMaze(width, height)
        generateMaze(width / 2, height / 2)
    }

    private fun generateMaze(x: Int, y: Int) {
        makeMeander(x, y)
        val needExit = makeEntry()

        if (needExit) {
            makeExit()
        }
    }


    private fun makeMeander(x: Int, y: Int) {
        val directions = listOf(
            Pair(0, 2),
            Pair(2, 0),
            Pair(0, -2),
            Pair(-2, 0)
        ).shuffled()

        for ((dx, dy) in directions) {
            val nx = x + dx
            val ny = y + dy

            if (nx in 1 until Maze.getWidth() - 1 && ny in 1 until Maze.getHeight() - 1 && Maze.getByIndex(Index(ny, nx)) == 1) {
                Maze.setByIndex(Index(y + dy / 2, x + dx / 2), 0)
                Maze.setByIndex(Index(ny, nx), 0)

                makeMeander(nx, ny)
            }
        }
    }

    private fun makeEntry(): Boolean {
        val row = Random().nextInt(Maze.getHeight() - 2) + 1

        var column = 0
        while (true) {
            val index = Index(row, column)
            Maze.setByIndex(index, 0)

            column++
            if (column >= Maze.getWidth())
                return false

            if (Maze.getByIndex(Index(row, column)) == 0)
                return true
        }

    }

    private fun makeExit() {
        val row = Random().nextInt(Maze.getHeight() - 2) + 1

        var column = Maze.getWidth() - 1
        while (true) {
            val index = Index(row, column)
            Maze.setByIndex(index, 0)

            column--
            if (column < 0)
                break

            if (Maze.getByIndex(Index(row, column)) == 0)
                break
        }

    }



    fun printMaze() {
        for (row in 0 until Maze.getHeight()) {
            for (column in 0 until Maze.getWidth()) {
                val cell = Maze.getByIndex(Index(row, column))
                print(if (cell == 1) "██" else "  ")
            }
            println()
        }
    }

}