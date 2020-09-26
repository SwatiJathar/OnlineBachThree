package Encapsulation;

public class AccessSpecifierDemo {

	private String name;
	private int mob;
	
	public void getName(){
		System.out.println(name);
	}
	
	public void setName(){
		name = "manish";
	}
	
	public void getMobile(){
		System.out.println(mob);
	}
	
	public void setMobile(){
		mob = 12345648;
	}
		
	public  void display(){
		System.out.println(name + "==" + mob);
	}
	
}
