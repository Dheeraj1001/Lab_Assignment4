package Sorting;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit of the Array:");
		int n =sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the element of the Array:");
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int temp;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-i-1; j++){
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("The Sorted Form of Array:");
		for(int i = 0; i < n; i++){
			System.out.print(array[i] + " ");
		}
	}
}
