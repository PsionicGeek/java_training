package abstractclassinterface;

public class Rectangle extends Shape{

	public Rectangle(int side1, int side2) {
		super(side1, side2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcArea() {
		// TODO Auto-generated method stub
		return this.getSide1()*this.getSide2();
	}

	@Override
	public int calcPm() {
		// TODO Auto-generated method stub
		return 2*(this.getSide1()+this.getSide2());
	}

}
