package polymorprism;

public class MethodOverloading {

	public int sum(){
		
		System.out.println(10+20);
		return 10;
	}
	
	public void sum(int a){
		System.out.println(10 + a);
	}
	
	public void sum(double a){
		System.out.println(10 + a);
	}
	
	public void sum(int a, double b){
		System.out.println(b + a);
	}
	
	public void sum( double b, int a){
		System.out.println(b + a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 4.5);
	}

}
