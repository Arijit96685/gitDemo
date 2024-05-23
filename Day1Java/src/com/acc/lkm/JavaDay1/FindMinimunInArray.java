package com.acc.lkm.JavaDay1;

public class FindMinimunInArray 
{
public static void main(String[] args) {
	int[] array = {5, 3, 9, 1, 7};
    int min = findMinimum(array);
    System.out.println("Minimum element in the array: " + min);
}

public static int findMinimum(int[] arr) {
    if (arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array must not be empty or null");
    }
    
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}
}

