





class Recursion {
	static void show(){
		
		System.out.println("Hi Girls....!!!");
		
		show();					// This is called Recursion we are calling the function within itself.
	}						// but in this case we haven't mention any termination condition (Base Case)
							// therefor the result will be infinite loop
	
    public static void main(String[] args) {
		show();
       
    }
}