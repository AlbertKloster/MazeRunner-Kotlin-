package mazerunner

val mazeService = MazeService()

val startMenu = """
        === Menu ===
        1. Generate a new maze
        2. Load a maze
        0. Exit
    """.trimIndent()

val menu = """
    === Menu ===
    1. Generate a new maze
    2. Load a maze
    3. Save the maze
    4. Display the maze
    5. Find the escape
    0. Exit
""".trimIndent()

fun main() {

    var exit = false
    while (!exit) {
        println(if (mazeService.isGenerated()) menu else startMenu)
        when (MenuOption.getOption(readln())) {
            MenuOption.GENERATE -> generate()
            MenuOption.LOAD -> load()
            MenuOption.SAVE -> save()
            MenuOption.DISPLAY -> display()
            MenuOption.FIND -> find()
            MenuOption.EXIT -> exit = true
        }
    }
    println("Bye!")
}

private fun generate() {
    println("Enter the size of a new maze")
    val size = readln().toInt()
    mazeService.generate(size)
    display()
}

private fun load() {
    val filename = readln()
    mazeService.load(filename)
}

private fun save() {
    if (mazeService.isGenerated()) {
        val filename = readln()
        mazeService.save(filename)
    }
}

private fun display() {
    if (mazeService.isGenerated())
        mazeService.display()
}

private fun find() {
    if (mazeService.isGenerated()) {
        mazeService.find()
        mazeService.displaySolution()
    }
}

