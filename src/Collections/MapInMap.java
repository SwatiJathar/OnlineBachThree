package Collections;

import java.util.HashMap;

public class MapInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, HashMap<String, Double> > flightDetails = new HashMap<String, HashMap<String, Double> >();
		
		HashMap<String, Double> airaisa = new HashMap<String, Double>();
		airaisa.put("I5-980 | I5-971", 4405.00);
		airaisa.put("I5-980 | I5-972", 4505.00);
		
		HashMap<String, Double> airindia = new HashMap<String, Double>();
		airindia.put("AI-803", 9405.00);
		airindia.put("AI-805", 14505.00);
		
		flightDetails.put("AirAsia", airaisa);
		flightDetails.put("AirIndia", airindia);
		
		System.out.println(flightDetails);
		System.out.println(flightDetails.get("AirIndia"));
		System.out.println(flightDetails.get("AirAsia"));
		
		
		System.out.println(flightDetails.get("AirIndia").get("AI-805"));
	}

}
