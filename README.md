# csis10a-lab-12

## Getting started

Clone or download this lab. It can be used via Maven and your favorite editor or in BlueJ.



## Part A

In this exercise we will practice working with arrays.  The main method is already stubbed out for you. You must implement the methods ex1 through ex7 as described below. You can run your program using `mvn exec:java "-Dexec.mainClass=Lab12"`.

### `problem1()`

1. Declare an array of int called `stuff`, 
2. and (on same line) add initialize it to set up stuff with the following data: `{1, 5, 2, 9, 8, 4, 0, 3}`
3. Display "3. The length of the stuff array is: " followed by the length of the array.  Don't type the number.  Use the length data field for the array you created.

Expected result:  

```text
-- Problem 1 ----------
3. The length of the stuff array is: 8
0:1  1:5  2:2  3:9  4:8  5:4  6:0  7:3
```

### `problem2()`

4. Declare a 4-element array of char called `word` 
5. and (on same line) initialize word with the following data: `{'W', 'a',  'i',  't'}`
6. Display "6. The length of the word array is: " followed by the length of the array.  Don't type the number.  Use the length data field.

Expected Result:

```text
-- Problem 2 ----------
6. The length of the word array is: 4
0:W  1:a  2:i  3:t  
```

### `problem3()`

7. Declare a 10 element array of double called `moreStuff`
8. On separate lines, set the first 5 elements of the array to these values: `1.1, 2.2, 3.3, 4.4, 5.5`
9.Display "9. The length of the moreStuff array is: " followed by the length of the array.  Don't type the number.  Use the length data field.
11. Write a method (below main) named `displayArray` that will display an array of type `double[]`.
12. Use the method to display the `moreStuff` array.
13. Change the third element from 3.3 to 1000.
14. Change the last element to 99.
15. Display the array again beginning on a new line.

Expected result:  

```text
-- Problem 3 ----------
9. The length of the moreStuff array is: 10
0:1.1  1:2.2  2:3.3  3:4.4  4:5.5  5:0.0  6:0.0  7:0.0  8:0.0  9:0.0  
0:1.1  1:2.2  2:1000.0  3:4.4  4:5.5  5:0.0  6:0.0  7:0.0  8:0.0  9:99.0
```  

### `problem4()`

There is a 6 element array of int called `data`, already set to `[0 1 2 3 4 5]`.  Using array assignment:

16. Put a 10 in the first position of the array.  
17. put a  27 in the last position of the array. 
18. display the contents of position 2 of the array. 
19. then input a value from keyboard and store in the 5th spot (the 4th array position).

Expected Result:

```text
-- Problem 4 -----------
2
Enter an integer: 7
0:10  1:1  2:2  3:3  4:7  5:27  
```

### `problem5()`

20. Make a 12-element double array called `samples`.  
21. Make an int variable called `index` and set it to 3.
22. Put a 10 in the samples array at position index.  
23. put an 11 in the array at the position immediately following index (use `index + 1` in square brackets).  
24. put a 7 in the array at two positions before index ( use `index - 2` in square brackets).
25. display the samples array

Expected Result:  

```text
-- Problem 5 ----------
0:0.0  1:7.0  2:0.0  3:10.0  4:11.0  5:0.0  6:0.0  7:0.0  8:0.0  9:0.0  10:0.0  11:0.0  
```

### `problem6()`

Shallow Copying Arrays.  

26. Create an int array named `array1` with the values 2, 4, 6, 8, 10.
27. Create an int array named `array2` and set it equal to array1.  (`int[] array2 = array1;`)
28. Change position 0 of array2 to 99.
29. Display array1 and array2.  Position 0 of *both* arrays changed.  Why?   If you do not know the answer, you'll get no credit for this lab.

Expected Result:  

```text
-- Problem 6 ----------
0:99  1:4  2:6  3:8  4:10  
0:99  1:4  2:6  3:8  4:10  
```

### `problem7()`

Deep Copying Arrays

30. Below main, create a new method called `cloneArray` that takes an array of integers as a parameter, creates a new array that is the same size as the parameter, copies the elements from the first array into the new one, and then returns a reference to the new array. 
31. Back in the Problem 7 section in main, create an int array named `array3` with the values 1, 2, 3, 4, 5.
32. Declare an int array `array4` and assign it the clone of `array3`, using your `cloneArray` method.
33. Display `array3` and `array4`.  They should have the same values.
34. change element 0 of array4 to 99.
35. display `array3` and `array4`.  `array4`'s first element is 99, but `array3`'s first element did not change.

Expected Result:  

```text
-- Problem 7 ----------
0:1  1:2  2:3  3:4  4:5  
0:1  1:2  2:3  3:4  4:5  
0:1  1:2  2:3  3:4  4:5  
0:99  1:2  2:3  3:4  4:5  
```

## Part B

Now that you know how arrays work in Java, we’re going to work with the BoxBug classes from lab 10 and write a class `DancingBug` that "dance" by making different turns before each move. The `DancingBug` constructor has an integer array as a parameter. The integer entires in the array represent how many times the bug turns before it moves. For example, an array entry of 5 repressents a turn of 225 degrees (recall that one turn is 45 degrees). When a dancing bug acts, it should turn the number of times gien by the current array entry, then act like a `Bug`. In the next move, it should use the next entry in the array. After carrying out the last turn in the array, it should start again with the intial array value so that the dancing bug continually repeats the same turning pattern.

The `DancingBugRunner` should create an array and pass it as a parameter to the `DancingBug` constructor.

Start by modifying the code for `BoxBug` and `BoxBugRunner` provided (rename them to `DancingBug` etc), then modify them according to the instructions embedded in the files. Finally, add 4 DancinBugs to the Grid – make a line dance!
