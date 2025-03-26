




class RecursionClassWork2 {
	
	static void multiTable(int n, int multi){
		if(multi > 10){
			return ;
		}
		else{
		System.out.println(n + " * " + multi + " = " + (n * multi));
		multiTable(n, multi+1);
		
		}
		
	}
	
    public static void main(String[] args) {

			int n = 5;

			multiTable(n,1);
			
			
	}
}



		