package Inheritance;

public class Saving extends Account{

	double ROI;
	
	public Saving(){
		ROI = 7;
	}
	
	public Saving(String name, String type, double ROI){
		
		super(name,type);
		
		System.out.println("In Saving Class");
		this.ROI = ROI;
		
		super.accHolderName = "MAnish";
		super.accNo = 100;
	}
	
	public void displaySavingDetails(){
		//displayBankDetails();
		//displayAccountDetails();
		System.out.println(ROI);
	}
	
	public void setSavingDetails(double ROI){
		this.ROI = ROI;
	}

}
