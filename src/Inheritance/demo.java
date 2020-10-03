package Inheritance;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saving s = new Saving("SBI", "Saving", 3.5);
		Saving s1 = new Saving("HDFC", "Current", 4.5);
		//s.setBankDetails("SBI", "Shivaji Nagar", "JM Road Shivaji Nagar", 123);
		//s.setAccountDetails("Manish", "Saving", 101);
		//s.setSavingDetails(3.5);
		
		s.displayBankDetails();
		s.displayAccountDetails();
		s.displaySavingDetails();
		
		
		s1.displayBankDetails();
		s1.displayAccountDetails();
		s1.displaySavingDetails();
		
		Saving s2 = new Saving();
		s2.displayBankDetails();
		s2.displayAccountDetails();
		s2.displaySavingDetails();
	}

}
