package Exception;

public class ArrayIndexOutOfBoundExp {
	int a;
	static int [][] arrNumbers = new int[2][3];
	
	public static void display()throws ArrayIndexOutOfBoundsException, ArithmeticException, InterruptedException{
		System.out.println(arrNumbers[0][3]);
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//checked exception
		
		try{
			display();
			display();
			display();
			display();
			display();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		//runtime exception / unchecked expection
		
		try{
			int a =0;
			System.out.println("db connection ");
			if(a == 0){
				throw new Exception("Number must be greater than zero");// ArithmeticException();
			}
			System.out.println(10/a);//select * xyz;
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
			System.out.println(10/1);//select * xyz;
			
		}finally {
			System.out.println("db connection close");
		}
		
		
		
		try{
			System.out.println(10/1);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("in Catch block - "  + e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try{
			System.out.println("in try block2 ");
			System.out.println(arrNumbers[0][3]);
			arrNumbers[0][0] = 100;
			arrNumbers[0][1] = 200;
			arrNumbers[0][2] = 300;
			arrNumbers[1][0] = 400;
			arrNumbers[1][1] = 500;
			arrNumbers[1][2] = 600;
		}catch (ArithmeticException e) {
			System.out.println("can divide by zero -" + e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Plese send correct index  - "  + e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("in finally");
		}
		
		try{
			ArrayIndexOutOfBoundExp obj = null;
			//obj.a = 10;
			//open file filepath 
			//reading file
			//obj.a = 10;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("after try catch");
	}

}