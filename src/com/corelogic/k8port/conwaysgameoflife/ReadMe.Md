# Conway's Game of Life

 The following is a TDD Kata- an exercise in coding, refactoring and test-first, that you should apply daily for at least 15 minutes (I do 30).

##TDD General Guidelines 

  * Try not to read ahead.
  * Do one task at a time. The trick is to learn to work incrementally.
  * Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata

###Exercise Overview
The Game of Life (aka "Life") is a cellular automaton devised by British mathematician John Horton Conway in 1970.
It is a zero-player game, meaning its evolution is determined by its initial state, requiring no further input.  A player interacts with Game of Life
by creating an initial configuration and observing how it evolves, or for advanced players, by creating patterns with particular properties.

The universe of the Game of Life is an infinite, 2d orthogonal grid of square cells, each of which has two possible states: alive or dead.

Every cell interacts with its 8 neighbours, cells which are horizontally, vertically or diagonally adjacent.

####Game Rules
At each step in time, the following transitions occur:

   1. **underpopulation:** a live cell with < 2 live neighbors dies
   
   2. **sustaining:** a live cell with >= 2 and <= 3 live neighbors continues to live
   
   3. **overpopulation:** a live cell with > 3 live neighbors dies
   
   4. **reproduction:** A dead cell with exactly 3 live neighbors becomes a live cell


####Lifespan of the Game
The initial pattern is called the _seed_.

The 1st generation is created by applying the rules simultaneously to each cell in the seed.  This discrete moment is known as a _tick_.

Each subsequent generation is a pure function of the preceding generation.

Generations spawn infinitely or until program is stopped. 

####Game of Life Keys for Successful TDD

* Start with the simplest test case (0)

* Progress to 1, 2 and then multiple numbers.
       
* Refactor after each requirement is met with all tests passing.

* Solve as simply as possible.

## Game of Life Requirements
1. Create a simple 2d grid with following method:
    
    ```boolean[] seed(int n)```
     
    The method should take any whole number _n_ and return a 2-d grid of _n x n_ square cells.
    
    Each cell will contain a boolean value _true_ if cell is live. 
    
    The _seed_ may be initialized as follows:
    
    * all _false_ (all dead)
    * all _true_ (all live)
    * randomly generated true and false values
               
2. Implement the following method representing generational iterations:

    ```void tick()```
    
    It is within ```tick()``` that the **Rules of Game of Life** are applied:
        
    * A live cell with < 2 live neighbors dies
    * A live cell with <= 3 and >= 2 live neighbors stays live
    * A live cell with > 3 live neighbors dies
    * A dead cell with exactly 3 live neighbors becomes live

3. Implement ```seed()``` with 2 ```int``` inputs (```seed(n1, n2)```), allowing grid to become an orthogonal grid of a rectangular shape.

4. Implement ```seed()``` with an input of ```int[]``` of length 2 ```seed({n1, n2})``` where ```n1``` is row length and ```n2``` is column length.

 ---
Stop here if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.
 ---
X1. Implement the following method creating pictorial representation of grid at each _tick_:
 
 ```void display()```
 
 The method may be implemented progressively as follows:
 
 * Using output stream and binary values to create a representative grid
 * Implement a representation where grid's value to change on each _tick_
 * Use advanced classes and/or technologies to create a more stunning visual representation of the game

 