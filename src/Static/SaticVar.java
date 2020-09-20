package Static;

public class SaticVar {

	static int noOfWheels = 4;
	
	int cc;
	String color, brand,model;
	double cost;
	
	public void display(){
		SaticVar.noOfWheels = 2;
		System.out.println(brand + "-" + model + "-"  + "-" + cc + "-" + color + "-" + cost + "-" + SaticVar.noOfWheels);
	}
	
	public static void printData() {
		System.out.println(SaticVar.noOfWheels);
	}
	
	static{
		System.out.println("before execution" + noOfWheels);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaticVar.noOfWheels = 3;
		SaticVar.printData();
		
		
		SaticVar obj = new SaticVar();
		obj.brand = "Tata";
		obj.color = "White";
		obj.cc = 900;
		obj.cost=50000;
		obj.model="Nexon";
		obj.display();
		
		SaticVar obj1 = new SaticVar();
		obj1.brand = "SM";
		obj1.color = "Red";
		obj1.cc = 1900;
		obj1.cost=90000;
		obj1.model="Baleno";
		obj1.display();
		
	}

}
