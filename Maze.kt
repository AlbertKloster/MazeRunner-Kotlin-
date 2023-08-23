package mazerunner

object Maze {

    private var maze: Array<IntArray> = Array(10) { IntArray(10) }

    fun setMaze(width: Int, height: Int) {
        maze = Array(height) { IntArray(width) { 1 } }
    }

    fun setByIndex(index: Index, value: Int) {
        if (index.row >= maze.size || index.column >= maze.first().size)
            throw RuntimeException("Out of bounds")
        maze[index.row][index.column] = value
    }

    fun getWidth() = maze.first().size

    fun getHeight() = maze.size

    fun getByIndex(index: Index) =
        if (index.row >= maze.size || index.column >= maze.first().size) null else maze[index.row][index.column]

}