package Inheritance;

public class Bank {

	String name, branch, address;
	int branchCode;
	int no;
	public Bank(String name){
		System.out.println("In Bank Class");
		this.name = name;
	}
	
	public void displayBankDetails(){
		System.out.println(name + " - " + branch + " - "+ address + " - " + branchCode);
	}
	
	public void setBankDetails(String name, String branch, String address, int branchCode ){
		this.name = name;
		this.branch = branch;
		this.address = address;
		this.branchCode = branchCode;
	}
	
}
