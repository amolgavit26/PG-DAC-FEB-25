




class RecursionClassWork4 {
	
	static String revString(String n){
		if(n.isEmpty()){
			return n;
		}
		else{
		return revString(n.substring(1)) + n.charAt(0);
		
		}
		
	}
	
    public static void main(String[] args) {

			String n = "CDACMumbai";

			
			System.out.println(revString(n));
			s
			
	}
}



		