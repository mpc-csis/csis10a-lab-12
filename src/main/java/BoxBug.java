/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */

// do steps 1 through 4 in the BoxBugRunner class first
//   then come back here to continue

public class BoxBug extends Bug {
    // 5a)  add another instance variable, an int array 
    //      called hotMoves (but don't assign it anything)  
    // 5b)  add another instance variable called index
    
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    // 6  instead of length, make the parameter an int array
    //     called hotMoves
    public BoxBug(int length) {
        // 7a  assign this.hotMoves the value of the hotMoves parameter
        //     this saves a reference to the array given to the 
        //     constructor in the main method in DancingBugRunner
        // 7b  initialize index to 0
        
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act() {
        // 8  now we are going to turn the bug 
        //    the current number of turns at the 
        //    value in the hotMoves array indicated by 
        //    index. 
        // 
        //    Use a while loop or a for loop to do this
        //    the number of times the loop repeats 
        //    should be  turns[index]
        //    in the body of the loop, call the turn 
        //    method once
        
        
        
        // 9  add an if statement so that if the bug can move
        //    it moves
        
        
        // 10 add an if statement so that if index is equal to 
        //    the length of the hotMoves array, set index back to 0
        //    (which starts us back at the beginning of the array)
        
        // remove all this code below since it's for a BoxBug
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        }
        else {
            turn();
            turn();
            steps = 0;
        }
        // don't remove anything after this!
    }
}
