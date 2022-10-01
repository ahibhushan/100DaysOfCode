import java.util.*;
public class MaxMinElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if(max<arr[i]){
                max=arr[i];
            }            
        }
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if(min>arr[i]){
                min=arr[i];
            }            
        }
        System.out.println("Largest element in the array:"+max);
        System.out.println("Smallest element in the array:"+min);
        sc.close();
    }
}
