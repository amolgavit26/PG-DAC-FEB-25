
class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        try{
            System.out.println("In try");
            int a = 10/0;
        
        }catch(NullPointerException e){
            System.out.println("Catch");

        }catch(ClassCastException e){
            System.out.println("NullPointer");

        }
        /*catch(Exception e){            // error: exception NumberFormatException has already been caught
            System.out.println("Catch");    //Because we must have to maintain the hierarchy of exception

        }*/
        catch(RuntimeException e){
            System.out.println("RuntimeException");

        }catch(Exception e){
            System.out.println("Exception");

        }catch(Throwable e){
            System.out.println("Throwable");

        }finally{
            System.out.println("Finally");
        }
    }
}