# Stage 1/4: Display a maze
## Description
Implement the maze as a two-dimensional array of integers. If the value of an element is 1, it is a wall. If the value is 0, it is a passage.

Your maze must be 10x10. Other rules are as follows:
1. There should be walls around the maze, except for two cells: entrance and exit.
2. Any empty cell should be accessible from the entrance or exit of the maze. It is impossible to move diagonally, only vertically or horizontally.
3. There has to be a path from the entrance to the exit. It doesn't matter what is considered an entrance and what is an exit as they are interchangeable.
4. It is not allowed to create blocks in the maze consisting only of walls, such as 3x3 ones.

To print the array, follow these two rules:
- to display a pass, use two space characters;
- to display a wall, use two block characters in a row (the same): █ (Unicode character with code U+2588).

You can print a wall like this: `print("\u2588\u2588")` and a pass like this: `print(" ")`.

Remember that the maze is only visible if you have a monospaced font! Otherwise, the space symbol will be quite small in width.

## Objectives
Print a 10x10 maze. At this stage, it does not matter what maze you display. The program may always output the same prepared maze or one of a set of prepared mazes.

## Example
After starting, your program should output a maze and then stop.
```
████████████████████
    ██  ██  ██    ██
██  ██      ██  ████
██      ██████
██  ██          ████
██  ██  ██████  ████
██  ██  ██      ████
██  ██  ██████  ████
██  ██      ██    ██
████████████████████
```
