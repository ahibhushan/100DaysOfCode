### Problem Statement
You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they are all the same height, then return the height.

### Function Description

Complete the equalStacks function in the editor below.

equalStacks has the following parameters:

int h1[n1]: the first array of heights

int h2[n2]: the second array of heights

int h3[n3]: the third array of heights

### Returns

int: the height of the stacks when they are equalized

### Input Format

->The first line contains three space-separated integers n1, n2, n3, and , the numbers of cylinders in stacks 1, 2, and 3. The subsequent lines describe the respective heights of each cylinder in a stack from top to bottom:

-->The second line contains n1 space-separated integers, the cylinder heights in stack 1. The first element is the top cylinder of the stack.

-->The third line contains n2 space-separated integers, the cylinder heights in stack 2. The first element is the top cylinder of the stack.

-->The fourth line contains n3 space-separated integers, the cylinder heights in stack 3. The first element is the top cylinder of the stack.

### Sample Input
```
STDIN       Function
-----       --------
5 3 4       h1[] size n1 = 5, h2[] size n2 = 3, h3[] size n3 = 4  
3 2 1 1 1   h1 = [3, 2, 1, 1, 1]
4 3 2       h2 = [4, 3, 2]
1 1 4 1     h3 = [1, 1, 4, 1]
```
### Sample Output
```
5
```