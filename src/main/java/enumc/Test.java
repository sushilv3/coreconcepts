package enumc;

public class Test {

	public static void main(String[] args) {
			
		Bike b= new Bike("Honda", Colors.BLUE,CcEngine.A.getValue());
		System.out.println("Bike Details : "+b);
	}

}
