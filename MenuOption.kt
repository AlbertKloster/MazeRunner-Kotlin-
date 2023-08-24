package mazerunner

enum class MenuOption(val number: String) {
    GENERATE("1"),
    LOAD("2"),
    SAVE("3"),
    DISPLAY("4"),
    FIND("5"),
    EXIT("0");

    companion object {
        fun getOption(input: String): MenuOption {
            for (option in MenuOption.values()) {
                if (option.number == input) return option
            }
            throw RuntimeException("Wrong option: $input")
        }
    }
}