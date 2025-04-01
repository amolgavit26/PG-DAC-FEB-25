import java.util.*;

class Problem1{

public static void main(String args[]){
		int[] arr = {10, 0, 5, 20, 0, 8, 15, 20};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Second Largest: " + secoundLargest(arr));
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int secoundLargest(int arr[]){
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(first < arr[i]){
				second = first;
				first = arr[i];
			} else {
				second = arr[i];
			}
		}
		return second;
	}
	
	public static void moveZeroes(int arr[]){
		int track=0;
		for(int	j=0; j < arr.length; j++){
			if(arr[j] != 0){
				arr[track++] = arr[j]; 
			}
		}
		for(int k = track; k < arr.length; k++){
			arr[k] = 0;
		}
	}





}