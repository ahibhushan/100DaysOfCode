
# Insert a node at the head of a linked list



### Problem Statement
Given a pointer to the head of a linked list, insert a new node before the head. The next value in the new node should point to head and the data value should be replaced with a given value. Return a reference to the new head of the list. The head pointer given may be null meaning that the initial list is empty.
  

### Function Description
Complete the function insertNodeAtHead in the editor below.
  
insertNodeAtHead has the following parameter(s):  
-->SinglyLinkedListNode llist: a reference to the head of a list  
-->data: the value to insert in the data field of the new node

### Input Format
The first line contains an integer n, the number of elements to be inserted at the head of the list.  
The next n lines contain an integer each, the elements to be inserted, one per function call.  


### Constraints
1 <= n <= 1000  
1 <= list[i] <= 1000

### Sample Input
````
5
383
484
392
975
321
````

### Sample Output
````
321
975
392
484
383
````

### Explaination
Intially the list in NULL. After inserting 383, the list is 383 -> NULL.  
After inserting 484, the list is 484 -> 383 -> NULL.  
After inserting 392, the list is 392 -> 484 -> 383 -> NULL.  
After inserting 975, the list is 975 -> 392 -> 484 -> 383 -> NULL.  
After inserting 321, the list is 321 -> 975 -> 392 -> 484 -> 383 -> NULL.  
