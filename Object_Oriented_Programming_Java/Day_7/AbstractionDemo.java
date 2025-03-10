/*
abstract class Shape{
	abstract void draw();
	
	
}

class Circle extends Shape{
	 void draw();
	{
		System.out.println("Draw: Circle");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Draw: Rectangle");
	}
}

class AbstractionDemo{
	public static void main(String args[]){
		Shape s1 = new Circle();
		s1.draw();
		
		
		Shape s2 = new Rectangle();
		s2.draw();
		
		Rectangle s3 = new Rectangle();//Normal class execution
		s2.draw();
		
		//Shape s4 = new Shape();//Error: abstraction
		s4.draw();
	}	
}

*/


// Abstraction Example:

abstract class Vehical{
	abstract void price(int price);
	
}

class Bike extends Vehical{
	static int price;
	
	void price(int price){
		this.price = price;
		System.out.println(price);
	}
	static void colour(){
		if(price > 50){
			System.out.println("Colour is Black");
		}
		else{
			System.out.println("Colour is Red");
		}

}

}


class AbstractionDemo{
	public static void main(String args[]){
		Vehical v1 = new Bike();
		v1.price(10);
		Bike.colour();
}
}