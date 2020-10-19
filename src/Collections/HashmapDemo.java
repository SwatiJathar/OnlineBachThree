package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		i = 12;
		
		map.put("OnlineBatchOne", 10);
		map.put("manish", 100);
		map.put("Sapana", 200);
		map.put("OnlineBatchTwo", 200);
		
		map.put("manish", 300);
		
		System.out.println(map);
		
		System.out.println(map.get("manish"));
	}

}
