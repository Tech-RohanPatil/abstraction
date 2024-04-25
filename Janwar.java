package Abstraction;

abstract class Animal{
	
	abstract void sound();
}
class Lion extends Animal{
	
	void sound() {
		System.out.println("Lion is the king of jungle");
	}
}
class Tiger extends Animal{
	
	void sound() {
		System.out.println("Tiger is powerful animal");
	}
}

public class Janwar {

	public static void main(String[] args) {
	
		Animal a1 = new Lion();
		
		a1.sound();
		
	           a1 = new Tiger();
	    
	    a1.sound();          

	}

}
