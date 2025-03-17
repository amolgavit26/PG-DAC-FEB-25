
class ExceptionDemo7{
	

    public static void main(String[] args) {
		System.out.println("Started");
		
		int arr[] = {1,2,3,4,5}	;	
			try{
				for(int i = 0; i < 6; i++){
				arr[i] = 0;
				}		
			}catch(ArrayIndexOutOfBoundsException e){
		}finally{
			System.out.println("Release resources!!!");
		}
		
		System.out.println("Finished");
		
		
    }
}
