package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class MultipleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< String, ArrayList<String> > map = new HashMap< String, ArrayList<String> >();
		
		ArrayList<String> onlineBatchTwo = new ArrayList<String>();
		onlineBatchTwo.add("Makrand");
		onlineBatchTwo.add("Ashwini");
		
		ArrayList<String> onlineBatchThree = new ArrayList<String>();
		
		onlineBatchThree.add("Sapana");
		onlineBatchThree.add("Swathi");
		
		map.put("onlineBatchTwo", onlineBatchTwo);
		map.put("onlineBatchThree", onlineBatchThree);
		
		//onlineBatchTwo.get(0);
		
		System.out.println(map);
		
		System.out.println(map.get("onlineBatchThree"));
		System.out.println(map.get("onlineBatchThree").get(1));
		
	}

}
