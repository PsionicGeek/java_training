package abstractclassinterface;

public class UseAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		meth(new Square(5));
		meth(new Rectangle(15,10));
		
	}
	
	public static void meth(Shape ob) {
		//calc paramter;
		System.out.println(ob.calcArea());
		
		//calc area
		
		System.out.println(ob.calcPm());
	}

}
