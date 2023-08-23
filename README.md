# Stage 3/4: Saved and loaded
## Description
The program should provide a menu with five options:

1. Generate a new maze.
2. Load a maze.
3. Save the maze.
4. Display the maze.
5. Exit.

After a maze is generated or loaded from a file, it becomes the current maze that can be saved or displayed.

If there is no current maze (generated or loaded), a user should not see the options <b>save</b> and <b>display the maze</b>. If a user chooses an option that requires a file, he must enter a path to the file. You must always check the result of processing files and display user-friendly messages.

The program should output the maze to the user only in two scenarios:

- After <b>generating</b> a maze;
- After choosing an option <b>display the maze</b>.

Your program must successfully handle the following cases:

- if an incorrect option was chosen, the program must print a message like `Incorrect option. Please try again`;
- if a file to load a maze does not exist, the program should not stop, it must print a message like `The file ... does not exist`;
- if a file has an invalid format for a maze, the program should not stop, but it must print a message like `Cannot load the maze. It has an invalid format`.

By the way, you can store the maze in any format, the tests do not check the contents of the file. The most important thing is that the saved maze must be correctly loaded into the program.

## Objectives
After starting, your program must print a menu listing only appropriate options. When a user has chosen an option, the program must perform the corresponding action. Notice that the maze should be a <b>square</b>, so the user should input a single integer in order to specify the maze size.

<b>Note</b>, the program should not stop until the user selects the exit option.

## Example
The greater-than symbol followed by a space (`> `) represents the user input. Notice that it's not part of the input.
```
=== Menu ===
1. Generate a new maze
2. Load a maze
0. Exit
>1
Enter the size of a new maze
>17
██████  ██████████████████████████
██████  ██████████████████████████
██  ██                          ██
██  ██████████████  ██████████████
██  ██              ██  ██  ██  ██
██  ██████████████  ██  ██  ██  ██
██      ██                      ██
██████  ██████████  ██  ██████████
██      ██          ██  ██      ██
██████  ██████████  ██████  ██████
██              ██              ██
██  ██  ██  ██  ██  ██████████████
██  ██  ██  ██              ██  ██
██  ██████████  ██  ██  ██████  ██
██  ██          ██  ██          ██
████████  ████████████████████████
████████  ████████████████████████

=== Menu ===
1. Generate a new maze
2. Load a maze
3. Save the maze
4. Display the maze
0. Exit
>3
>maze.txt

=== Menu ===
1. Generate a new maze
2. Load a maze
3. Save the maze
4. Display the maze
0. Exit
>0
Bye!
```
