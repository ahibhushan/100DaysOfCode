## Problem Statement
There is a strange counter. At the first second, it displays the number 3. Each second, the number displayed by decrements by 1 until it reaches 1. In next second, the timer resets to 2*the initial number for the prior cycle and continues counting down.

Find and print the value displayed by the counter at time t.

## Function Description

Complete the strangeCounter function in the editor below.  
strangeCounter has the following parameter(s):

- int t: an integer

## Returns

- int: the value displayed at time t

## Input Format

- A single integer, the value of t.

## Sample Input
```
4
```
## Sample Output
```
6
```
## Explanation

Time t=4 marks the beginning of the second cycle. It is double the number displayed at the beginning of the first cycle: 2*3=6. This is shown in the diagram in the problem statement.