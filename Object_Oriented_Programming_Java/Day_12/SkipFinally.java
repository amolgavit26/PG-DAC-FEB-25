class Main {
    public static void main(String[] args) {
        
        try{
            
            System.out.println("Before try");
            int a = 10/0;
            
            System.out.println("After try");
        }catch(ArithmeticException e){
            System.out.println("Catch");
            System.exit(0);     // this is use to exit from the programm. (to not print finally block)
        }finally{
            System.out.println("Finally");
        }
        System.out.println("Main");
    }
}