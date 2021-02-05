package Sorting;
import java.util.*;
public class InsertionSort {

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
		int max=0, j;
		for(int i = 0; i < n; i++){
			max = array[i];
			j = i - 1;
			while(j >= 0 && array[j] > max){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = max;
		}
		System.out.println("The Sorted Form of Array:");
		for(int i = 0; i < n; i++){
			System.out.print(array[i] + " ");
		}
	}
}
