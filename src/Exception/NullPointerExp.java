package Exception;

public class NullPointerExp {

	int a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerExp obj = new NullPointerExp();
		NullPointerExp obj1 = null;
		obj.a = 10;
		System.out.println(obj.a);
		
		obj1.a = 10;
		System.out.println(obj1.a);
	}

}
