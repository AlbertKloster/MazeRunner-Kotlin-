# Stage 2/4: Maze generator
## Description
In this stage, you will develop an algorithm for creating a maze.

Don't forget the rules of the correct maze:

1. There should be walls around the maze, except for two cells: entrance and exit.
2. Any empty cell must be accessible from the entrance or exit of the maze. It is not possible to walk along the maze diagonally, only vertically and horizontally.
3. There's got to be a path from the entrance to the exit. It doesn't matter what is considered an entrance and what is an exit as they are interchangeable.
4. The maze should not contain 3x3 blocks consisting of walls only. Try to fill the entire maze area with pathways.

There is a very good algorithm for building a maze, based on the construction of a minimal spanning tree. You can <a href="https://www.youtube.com/watch?v=cQVH4gcb3O4">watch the video</a> on how this algorithm works.

It should be possible to specify the size of the maze. After a user enters the size, the program must print a maze and then stop.

Break your program down into a set of methods to make it easy to understand and add to or edit later.

## Objectives
After starting, your program should ask a user to enter the size of the maze, then output a generated maze, and then stop. The user should input 2 numbers. The first number is height and the second number is width.

## Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

<b>Example 1:</b>
```
Please, enter the size of a maze
>7 9
██████████████████
████      ██  ████
████████  ██  ████
██      ████
████  ██  ██
████      ██  ████
██████████████████
```

<b>Example 2:</b>
```
Please, enter the size of a maze
>15 35
██████████████████████████████████████████████████████████████████████
██  ██                  ██                  ██              ██
██████  ██  ██████████████████  ██████████████████  ██████████  ██████
██      ██  ██                              ██      ██  ██  ██
██████  ██  ██████████  ██  ██  ██████████  ██  ██  ██  ██  ██  ██████
██  ██  ██      ██      ██  ██  ██  ██          ██          ██      ██
██  ██  ██  ██  ██████████████████  ██████  ██████████████  ██████  ██
██          ██  ██      ██  ██              ██                  ██  ██
██████  ██  ██████████  ██  ██████████  ██████████████████████  ██  ██
██  ██  ██  ██              ██      ██  ██              ██      ██  ██
██  ██  ██  ██████████  ██████████  ██████████████  ██  ██  ██████  ██
██      ██      ██  ██  ██          ██          ██  ██              ██
██  ██████  ██████  ██  ██  ██  ██  ██████████  ██  ██████  ██  ██  ██
██  ██                      ██  ██                  ██      ██  ██  ██
██████████████████████████████████████████████████████████████████████
```
