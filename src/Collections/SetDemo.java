package Collections;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hsValue = new HashSet<String>();
		
		hsValue.add("Manish");
		hsValue.add("Zope");
		hsValue.add("Zope100");
		hsValue.add("Manish");
		hsValue.add("Zope");
		hsValue.add("Zope100");
		hsValue.add("Manish");
		hsValue.add("Manish");
		hsValue.add("Manish");
		hsValue.add("Manish");
		
		hsValue.remove("Manish");
		System.out.println(hsValue);
		
		for (String iValue : hsValue) {
			System.out.println(iValue);
		}
	}

}
