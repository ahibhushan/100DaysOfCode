### Problem Statement
Given a pointer to the root of a binary tree, you need to print the level order traversal of this tree. In level-order traversal, nodes are visited level by level from left to right. Complete the function levelOrder and print the values in a single line separated by a space.

### Input Format

You are given a function,
```
void levelOrder(Node * root) {

}
```
### Output Format

Print the values in a single line separated by a space.

### Sample Input
```
     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
```
### Sample Output
```
1 2 5 3 6 4
```

Explanation

We need to print the nodes level by level. We process each level from left to right.

Level Order Traversal: 1->2->5->3->6->4.