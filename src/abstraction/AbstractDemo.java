package abstraction;

public class AbstractDemo extends AbstractClass {

	public void displayname(){
		System.out.println("under child class implemented method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractClass obj = new AbstractClass();
		AbstractDemo obj = new AbstractDemo();
		obj.display();
		obj.displayname();
		
		SBI s = new SBI();
		s.roi();
		s.calIntrest();
		s.calLateFee();
		
		Kotak k =  new Kotak();
		k.roi();
		k.calIntrest();
		k.calLateFee();
		
		xyz.defaultmethod();
	}

}
