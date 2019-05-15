# Conway's Game of Life

 The following is a TDD exercise - to get used to coding, refactoring and test-first development. For best results, apply daily for at least 30 minutes.

 Before you start: 

  * Try not to read ahead.
  * Do one task at a time. The trick is to learn to work incrementally.
  * Only test for correct inputs. There is no need to test for invalid inputs.

#####Overview
The Game of Life (aka "Life") is a cellular automaton devised by British mathematician John Horton Conway in 1970.

It is a zero-player game, meaning its evolution is determined by its initial state, requiring no further input.  A player interacts with the Game of Life by creating an initial configuration and observing how it evolves. Advanced players may interact by creating patterns with particular properties.

The universe of the Game of Life is an infinite, 2d orthogonal grid of square cells, each of which has two possible states: alive or dead.

Every cell interacts with its 8 neighbours, cells which are horizontally, vertically or diagonally adjacent.

At each iteration, the following transitions occur (The Rules):

    1. Any live cell with fewer than 2 live neighbors dies (underpopulation).
    2. Any live cell with 2 or 3 live neighbors lives to the next generation (sustaining).
    3. Any live cell with more than 3 live members dies (overpopulation).
    4. Any dead cell with exactly 3 live neighbors (no more or less than 3) becomes a live cell (reproduction).

The initial pattern is the seed.

The 1st generation is created by applying the rules simultaneously to each cell in the seed.  This discrete moment is known as a 'tick'.

Each subsequent generation is a pure function of the preceding generation.

* Start with the simplest test case of 0 (returns null or undefined) and progress to 1, 2 and
  multiple numbers.
       
* Refactor after each requirement is met with all tests passing.

* Solve as simply as possible.

### Requirements
1. Create a simple 2d grid with method ```boolean[] seed(int n)```. 
    The method should take any whole number n and return a 2-dimensional boolean grid n x n squares.
    Seed values can be initialized as follows:
    
    * all false or Dead 
    * all true or Live
    * all null  
    * randomly generated true and false values
               
2. Write a method ```void tick()``` that represents each passing generation and mocks the rules of 'Life':
    * Any live (true) cell with < 2 live (true) neighbors dies (becomes false).
    * Any live (true) cell with <= 3 or >= 2 live (true) members continues to live (be true).
    * Any live (true) cell with > 3 live neighbors dies (becomes false).
    * Any dead (false) cell with =3 live neighbors (no more or less) will become live (becomes true).

  
 2. Allow the Seed method to handle 2 inputs, allowing grid to become an orthogonal grid of a rectangular shape.

 3. Allow Seed method to handle an int[] of length 2 containing grid dimensions.

 ---
stop here if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.
 ---

 6. Write a method ```void display``` that will illustrate grid at each generational tick. 
    * Use println() to illustrate represent a grid composed of binary values representing live and/or dead
    * Use More advanced illustrative classes to display grid

 
