package interfaceex;

interface Addition{
	int sum(int a , int b);
}

public class FunctionInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition ob = (int a, int b)->a+b;
		System.out.println(ob.sum(9, 50));
		

	}

}
