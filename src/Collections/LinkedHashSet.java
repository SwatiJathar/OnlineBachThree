package Collections;


public class LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedHashSet<String> lhsValue = new java.util.LinkedHashSet<>();
		lhsValue.add("Zope");
		lhsValue.add("manish");
		lhsValue.add("Zope 1000");
		lhsValue.add("Zope 5000");
		lhsValue.add("manish");
		System.out.println(lhsValue);
		
		for (String iValue : lhsValue) {
			System.out.println(iValue);
		}
	}

}
