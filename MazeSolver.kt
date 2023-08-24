package mazerunner

object MazeSolver {
    private val numRows = Maze.getHeight()
    private val numCols = Maze.getWidth()

    fun solve(entryIndex: Index): Boolean {
        return findPath(entryIndex.row, entryIndex.column)
    }

    private fun findPath(row: Int, column: Int): Boolean {
        // Check for exit
        if (row == numRows - 2 && column == numCols - 1) {
            Maze.setByIndex(Index(row, column), 2) // Mark the exit
            return true
        }

        // Check if the current cell is a valid path
        if (row in 0 until numRows && column in 0 until numCols && Maze.getByIndex(Index(row, column)) == 0) {
            Maze.setByIndex(Index(row, column), 2) // Mark the path

            // Try moving in all four directions (up, down, left, right)
            val directions = arrayOf(-1, 0, 1, 0, -1)
            for (i in 0 until 4) {
                val newRow = row + directions[i]
                val newCol = column + directions[i + 1]

                if (findPath(newRow, newCol)) {
                    return true
                }
            }

            // If no path found, backtrack by marking this cell as '0' again
            Maze.setByIndex(Index(row, column), 0)
        }

        return false
    }
}