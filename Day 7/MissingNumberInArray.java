/* Taken From:https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&status[]=solved&sortBy=submissions
Problem Statement: Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Example 2:
Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106
*/




//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
class MissingNumberInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}
// } Driver Code Ends
// User function Template for Java
class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int totalSum= (n)*(n+1)/2;
        int sum=0;
        for(int i = 0;i < n-1 ; i++){
            sum = sum+ array[i];
        }
        return (totalSum - sum);
    }
}