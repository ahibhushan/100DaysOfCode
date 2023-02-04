## Problem Statement
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

## Example
arr=[1,1,2,2,3].  
There are two each of types 1 and 2, and one sighting of type 3. Pick the lower of the two types seen twice: type 1.

## Function Description

Complete the migratoryBirds function in the editor below. It should return the lowest type number of the most frequently sighted bird.

migratoryBirds has the following parameter(s):
- arr: an array of integers representing types of birds sighted

## Input Format

- The first line contains an integer denoting n, the number of birds sighted and reported in the array arr.

- The second line describes arr as n space-separated integers representing the type numbers of each bird sighted.

## Constraints

- 5<=n<=2*10^5
- It is guaranteed that each type is 1, 2, 3, 4, or 5.

## Output Format

Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.

## Sample Input 0
```
6

1 4 4 4 5 3
```
## Sample Output 0
```
4
```
## Explanation 0

The different types of birds occur in the following frequencies:

- Type 1:1 bird
- Type 2:0  birds
- Type 3:1  bird
- Type 4:3  birds
- Type 5:1  bird  
The type number that occurs at the highest frequency is type 4, so we print 4 as our answer.