




class RecursionClassWork1 {
	
	static double sumOfSeries(int n){
		if(n == 1){
			return 1.0;
		}
		else{
		return sumOfSeries(n-1) + (n % 2 == 0 ? -1.0/n : 1.0/n);
		}
		
	}
	
    public static void main(String[] args) {

			int n = 3;

			System.out.println("Sum of series for N = " + n + " is: " + sumOfSeries(n));
			
	}
}



		