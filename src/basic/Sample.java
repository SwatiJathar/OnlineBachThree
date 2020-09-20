package basic;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strName = "Manish";
		int intEmpId = 101;
		float fltSalary = 1000.00f;
		double dblSalry = 1000.00;
		boolean boolIsPerEmp = false;
		
		strName = "Balaji";
		
		int intVal1 = 10;
		int intVal2 = 10;
		
		
		/*
		System.out.println("Hello " + strName );
		System.out.println("Emp ID " + intEmpId );
		System.out.println("Salary " + fltSalary );
		System.out.println("salary " + dblSalry );
		System.out.println("Per Emp " + boolIsPerEmp );
		*/
		/*
		System.out.println(10+10);
		System.out.println("10"+10);
		System.out.println(10 + "10");
		System.out.println(10-10);
		System.out.println(10*10);
		System.out.println(10/10);
		
		System.out.println(9<10); // false
		System.out.println(10>10); //false
		System.out.println(10<=10); // true
		System.out.println(10>=10); //true
		System.out.println(10==10); //true
		System.out.println(10!=10); //flase*/
		
		//	10 > 10
		if( intVal1 > intVal2  ) {
			System.out.println("Condition pass");
		} else if(intVal1 != intVal2){
			System.out.println("2nd Condition pass");
		}else if(intVal1 == intVal2){
			System.out.println("3nd Condition pass");
		} else {
			System.out.println("Condition fail");
		}
		
	}

}

