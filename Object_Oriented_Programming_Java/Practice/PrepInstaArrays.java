

// PrepInsta 100 Coding Queations



// Section4 ---> Important Codes related to Arrays


/*
	Q1 Java Program for finding the largest element of the array



class PrepInstaArrays{
	
	public static void main(String args[]){
		
	int arr[] = {15,82,64,21,12,36,14,3,3}; 
	
	int max = arr[0];
	
	for(int i = 0; i < arr.length; i++){
		if(max < arr[i]){
			max = arr[i];s
		}
	}
	
	System.out.print(max);
	
	
	
	}
}



	Q4 Java program for finding the second smallest element in an array



class PrepInstaArrays{
	
	public static void main(String args[]){
		
	int arr[] = {2,82,64,21,12,36,14,3,3}; 
	
	int small = arr[0];
	
	for(int i = 0; i < arr.length; i++){
		if(small > arr[i]){
			small = arr[i];
		}
	}
	
	int secondSmall = Integer.MAX_VALUE;
	
	
	for(int i = 0; i < arr.length; i++){
		if(small != arr[i] && arr[i] < secondSmall){
			secondSmall = arr[i];
		}
	}
	
	System.out.print(secondSmall);
	
	}
}


	Q5 JAVA Program for calculating the sum of all the elements of an array



class PrepInstaArrays{
	
	public static void main(String args[]){
		
	int arr[] = {2,82,64,21,12,36,14,3,3}; 
	
	int sum = 0;
	
	for(int i = 0; i < arr.length; i++){
		
		sum += arr[i];
	}
	
	
	System.out.print(sum);
	
	}
}


	Q6 Reverse an Array in Java
	
*/


class PrepInstaArrays{
	
	public static void main(String args[]){
		
	int arr[] = {2,82,64,21,12,36,14,3,3}; 
	
	
	for(int i = arr.length-1; i >= 0 ; i--){
		
		System.out.print(arr[i] + " ");
	}
	
	}
}




