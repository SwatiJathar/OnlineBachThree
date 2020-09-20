package constructor;

public class Car {
	
	int noOfWheels;
	int cc;
	String color, brand,model;
	double cost;
	
	Car(){
		System.out.println("object is created");
		this.noOfWheels = 4;
	}
	
	Car(String brand){
		this.brand = brand;
	}
	
	Car(String brand, String Model){
		this.brand = brand;
		this.model = Model;
	}
	
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
	

}
