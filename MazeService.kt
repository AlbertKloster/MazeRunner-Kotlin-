package mazerunner

import java.io.File
import java.lang.StringBuilder

class MazeService {
    private var size: Int = 0

    private fun initMaze() {
        Maze.setMaze(size, size)
        generateMaze(size / 2, size / 2)
    }

    fun isGenerated() = Maze.getHeight() > 0

    fun generate(size: Int) {
        this.size = size
        initMaze()
    }

    fun load(filename: String) {
        val rows = File(filename).readText().split("\n")
        val height = rows.size
        val width = rows.first().length / 2
        Maze.setMaze(width, height)
        for (row in 0 until height) {
            for (column in 0 until width) {
                val value = if (rows[row][column * 2] == ' ') 0 else 1
                Maze.setByIndex(Index(row, column), value)
            }
        }
    }

    fun save(filename: String) {
        File(filename).writeText(getMazeString())
    }

    fun display() {
        println(getMazeString())
    }

    private fun getMazeString(): String {
        val builder = StringBuilder()
        for (row in 0 until Maze.getHeight()) {
            for (column in 0 until Maze.getWidth()) {
                val cell = Maze.getByIndex(Index(row, column))
                builder.append(if (cell == 1) "██" else "  ")
            }
            builder.append("\n")
        }
        return builder.trim().toString()
    }

    private fun generateMaze(x: Int, y: Int) {
        makeMaze(x, y)

        val needExit = makeEntry()

        if (needExit) {
            makeExit()
        }
    }

    private fun makeMaze(x: Int, y: Int) {
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

                makeMaze(nx, ny)
            }
        }
    }

    private fun makeEntry(): Boolean {
        val row = findFirstRowWithZeroColumn()

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

    private fun findFirstRowWithZeroColumn(): Int {
        for (column in 1 until Maze.getWidth() - 1) {
            for (row in 1 until Maze.getHeight() - 1) {
                if (Maze.getByIndex(Index(row, column)) == 0) {
                    return row
                }
            }
        }
        return Maze.getHeight() / 2
    }

     private fun findLastRowWithZeroColumn(): Int {
        for (column in Maze.getWidth() - 2 downTo 1) {
            for (row in Maze.getHeight() - 2 downTo 1) {
                if (Maze.getByIndex(Index(row, column)) == 0 && findFirstRowWithZeroColumn() != row) {
                    return row
                }
            }
        }
        return Maze.getHeight() / 2
    }

    private fun makeExit() {
        val row = findLastRowWithZeroColumn()

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

}