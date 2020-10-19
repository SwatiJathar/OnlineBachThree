package Collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> arrList = new ArrayList<Object>();
		
		arrList.add("Manish");
		arrList.add(1234567890);
		arrList.add(true);
		
		System.out.println(arrList);
		
		System.out.println(arrList.get(0));
		
		arrList.remove(2);
		
		System.out.println(arrList);
		
		arrList.add(false);
		
		System.out.println(arrList);
		
		System.out.println("===============String=====================");
		
		ArrayList<String> arrstrList = new ArrayList<String>();
		arrstrList.add("Zope");
		arrstrList.add("Manish");
		arrstrList.add("Automation");
		System.out.println(arrstrList);
		System.out.println(arrstrList.get(0));
		
		int index = 0;
		System.out.println("===============Iterator=====================");
		while(index <=arrstrList.size()-1){
			System.out.println(arrstrList.get(index));
			
			index++;
			
			//arrList.remove(index);
		}
		arrstrList.add("Automation 10");
		System.out.println("===============Iterator 1 =====================");
		
		for (String value : arrstrList) {
			System.out.println(value);
			
		}
		
		System.out.println("===============Iterator 2 =====================");
		Iterator<String> it = arrstrList.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
