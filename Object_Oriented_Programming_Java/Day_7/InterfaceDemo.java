interface Animal{
	void sound();//Abstract method
}

class Dog implements Animal{
	public void sound(){
		System.out.println("Dog barks : sound");
	}
	
}

class InterfaceDemo{
	public static void main(String args[]){
		Dog a = new Dog();
		a.sound();
	}	
}