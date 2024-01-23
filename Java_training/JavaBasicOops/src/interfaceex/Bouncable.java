package interfaceex;
//feature-base contract
//declares what is features will be provided as part of this contract
//it does not implement these features
//in a way its like a specifications
public interface Bouncable {
	
	//all properties and variables in interface are by default public ,static  and final
	int baseBounceFactor =2;
	
	//all interface method are public and abstract
	void bounce();
	void setBounceFactor(int bf);
	
	static int getbaseBouncefactor() {
		System.out.println("bhai implement kr diya interface m with help of static");
		return baseBounceFactor;
	}
	
	default void display() {
		System.out.println("asse bhi kr skte h");
	}
	
}

interface Rollable{
	void roll();
//	default void display() {
//		System.out.println("this is display of rollable ");
//	}
	
}

class Ball implements Bouncable,Rollable{

	String ballType;
	int bounceFactor;
	Ball(String ballType){
		this.bounceFactor = Bouncable.baseBounceFactor*5;
		this.ballType= ballType;
	}
	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println(ballType +" ball is bouncing with bounce factor "+ this.bounceFactor );
		
	}

	@Override
	public void setBounceFactor(int bf) {
		this.bounceFactor= bf;
		System.out.println("hello "+this.bounceFactor);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println("ball can roll too");
		
	}
	
}

class Tyre implements Bouncable{
    String company;
    int bounceFactor;
    
    Tyre(String company){
    	this.company= company;
    	this.bounceFactor= Bouncable.baseBounceFactor*2;
    	
    }
	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println(company +" Tyre is bouncing with bounce factor "+ this.bounceFactor );
		
		
	}

	@Override
	public void setBounceFactor(int bf) {
		this.bounceFactor = bf;
		System.out.println("hello "+this.bounceFactor);
		// TODO Auto-generated method stub
		
		
	}
	
}

class Toy implements Bouncable{
	String material;
	int price;
	int bounceFactor;
	
	Toy(String material ,int price){
		this.material= material;
		this.bounceFactor= Bouncable.baseBounceFactor*5;
		this.price= price;
	}
	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println(material+" "+ price +" ball is bouncing with bounce factor "+ this.bounceFactor );
		
	}

	@Override
	public void setBounceFactor(int bf) {
		// TODO Auto-generated method stub
		this.bounceFactor = bf;
		System.out.println("hello "+this.bounceFactor);
	}
	
}
