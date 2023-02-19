package Sorting_Algorithms;
import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1,12,34,55,76,3,22,34};
		System.out.println(Arrays.toString(arr));
		// Bubble sort

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
    }
}
