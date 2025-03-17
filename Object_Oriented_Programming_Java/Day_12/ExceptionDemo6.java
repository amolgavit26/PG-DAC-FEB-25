
class ExceptionDemo6{
	
	void m1(){
		System.out.println("M1 :: Started");
	}
			
    public static void main(String[] args) {
		System.out.println("Started");
		
		ExceptionDemo6 a = null;
		try{
			//a.m1();			//Excetion e : NPE   "catch statement is missing to invoke NullPointerException
		}finally{
			//System.out.println("Release resources!!!");
		}
		
		System.out.println("Finished");
		
		
      
    }
}
