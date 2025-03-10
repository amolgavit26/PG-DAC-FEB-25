/*

class Employee{
	private int id;
	private String name;
	
	//Getter method
	public String getName(){
		 return name;
	}
	//Setter method
	public void setName(String name){
		this.name = name;
	}
}
class EncapsulationDemo{
	public static void main(String args[]){
		Employee e = new Employee();
		e.setName("Isha");
		System.out.println("Employee name= "+e.getName());
		System.out.println(id);
	}	
}
*/

class Student{
	private int id;
	private String result;
	
	// Getter method for result
	public String getResult(){
		return result;
	}
	
	// Setter method for result
	public void setResult(String result){
		this.result = result;
	}
	
	// Getter method for id
	public int getID(){
		return id;
	}
	
	// Setter method for id
	public void setID(int id){
		this.id = id;
	}
	
}

class EncapsulationDemo{
	public static void main(String args[]){
		Student st = new Student();
		st.setID(101);
		st.setResult("Pass");
		System.out.println("Student ID = " + st.getID() + " is " + st.getResult());
		
		
	}
	
}