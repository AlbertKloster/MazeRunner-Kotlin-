package mazerunner

class MazeService(private val width: Int, private val height: Int) {

    init {
        initMaze()
    }

    private fun initMaze() {
        Maze.setMaze(width, height)
    }

    fun setMaze(maze: List<List<Int>>) {
        for (row in maze.indices) {
            for (column in maze[row].indices) {
                Maze.setByIndex(Index(row, column), maze[row][column])
            }
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