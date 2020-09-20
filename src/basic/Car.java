package basic;

public class Car {

	int noOfWheels;
	int cc;
	String color, brand,model;
	double cost;
	
	//return type funcationname (parameters)
	void setData(String brand, String model, String color, int noOfWheels, int cc, double cost){
		
		this.brand = brand;
		this.noOfWheels = noOfWheels;
		this.cc = cc;
		this.color = color;
		this.cost = cost;
		this.model = model;
		
	}
	
	
	
	int display(){
		System.out.println(brand + "-" + model + "-" + noOfWheels + "-" + cc + "-" + color + "-" + cost);
		
		this.noOfWheels= 3;
		
		return 101;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car nexon = new Car();
		Car tiago = new Car();
		Car maruti = new Car();
		
		nexon.setData("Tata","Nexon","White",4, 1500,1300000);
		tiago.setData("Tata","Tiago","Red",4, 800,90000);;
		maruti.setData("SM","WagonR","Blue",4, 800,60000);;
		
		
		tiago.cc= tiago.display();
		System.out.println(tiago.cc);
		System.out.println(tiago.noOfWheels);
		nexon.display();
		maruti.display();
		
		
	}

}
