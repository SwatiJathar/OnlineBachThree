package Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> sValue = new Stack<Integer>();
		sValue.push(100);
		sValue.push(200);
		sValue.push(300);
		
		System.out.println(sValue);
		
		sValue.pop();
		System.out.println(sValue);
		
		for (Integer iValue : sValue) {
			System.out.println(iValue);
		}
		System.out.println("===============");
		Iterator<Integer> it = sValue.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
