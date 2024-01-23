package abstractclassinterface;

public class Square extends Shape {

	public Square(int side1) {
		super(side1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcArea() {
		// TODO Auto-generated method stub
		return this.getSide1()*this.getSide1();
	}

	@Override
	public int calcPm() {
		// TODO Auto-generated method stub
		return this.getSide1()*4;
	}
	
	

}
