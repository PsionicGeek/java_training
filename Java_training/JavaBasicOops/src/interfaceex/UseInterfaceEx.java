package interfaceex;

public class UseInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ball b = new Ball("Jumper");
//		b.bounce();
//		b.setBounceFactor(12);
//		b.bounce();

		Bouncable b;
		b = new Ball("Season");
		
		//b.bounce();
		func(b);
		
		b= new Tyre("CEAT");
		//b.bounce();
		func(b);
		
		b = new Toy("Plastic",1000);
		func(b);
		
		
		
		
		
		
	}
	
	static void func(Bouncable b) {
		b.bounce();
		b.setBounceFactor(33);
		//System.out.println(b.setBounceFactor(33));
		//b.bounce();
		
	}

}
