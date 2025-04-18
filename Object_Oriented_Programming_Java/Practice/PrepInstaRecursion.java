



/*
Q1 Power of a Number using Recursion in Java



class PrepInstaRecursion{
	
	public static void main(String args[]){

	int base = 6, x = 10;
    System.out.println ("Power is " + power (base, x));
  }

  static int power (int base, int x){
    if (x == 0)
      return 1;
    return (base * power (base, x - 1));
  } 

}


Q2 Prime Number using Recursion in Java



class PrepInstaRecursion{

     static boolean isPrime(int n, int i){
        if (n <= 2) 
           return (n == 2) ? true : false; 
       if (n % i == 0) 
           return false; 
       if (i * i > n)

            return true;
        return isPrime(n, i + 1);
    }
	
  public static void main(String[] args){  
    int n = 19;
    if (isPrime(n, 2))
      System.out.println("It's a Prime");
   else
     System.out.println("It's Not a Prime");
   }
 }
 
 
 
Q3 Recursive Program to find Largest Element of the array in Java
 
 
 
 
class PrepInstaRecursion{
	
    static int arr[] = {8, 25, 55, 90, 100};
    static int largest() {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)            
			if (arr[i] > max) max = arr[i];
        return max;
    }
	
    public static void main(String[] args){
        System.out.println("Largest in given array is " + largest());
    }
}



Q4 Program to find Smallest Element of the array using Recursion in Java


class PrepInstaRecursion{
	
	
     public static int findMinimum(int A[], int n)
    {
		
      if(n == 1)
        return A[0];
         
        return Math.min(A[n-1], findMinimum(A, n-1));
		
    }
     
    public static void main(String args[])
    {
        int A[] = { 50, 60, -2, 0, -101};
        int n = A.length;

        System.out.println("Smallest element in the array is: "+findMinimum(A, n));
    }
}




*/