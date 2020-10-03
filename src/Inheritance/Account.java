package Inheritance;

public class Account extends Bank {
	int accNo;
	String accHolderName, type;
	
	public Account(String name, String type){
		super(name);
		System.out.println("In Account Class");
		this.type = type;
		super.branchCode = 321;
		super.address = "JM Road";
		super.branch = "Shivaji nagar";
	}
	
	public void displayAccountDetails(){
		
		System.out.println(accNo + " - " + accHolderName + " - "+ type );
	}
	
	public void setAccountDetails(String accHolderName, String type, int accNo ){
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.type = type;
	}
	
}
