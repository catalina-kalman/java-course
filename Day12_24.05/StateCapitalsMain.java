package com.statecapitals;

import java.util.HashMap;
import java.util.Set;

public class StateCapitalsMain {

	public static void main(String[] args) {
		HashMap<String, String> stateCapitals = new HashMap<>();
		
		stateCapitals.put("Alabama", "Montgomery");
		stateCapitals.put("Alaska",	"Juneau");
		stateCapitals.put("Arizona", "Phoenix");
		stateCapitals.put("Arkansas", "Little Rock");
		stateCapitals.put("California", "Sacramento");
		stateCapitals.put("Colorado", "Denver");
		stateCapitals.put("Connecticut", "Hartford");
		stateCapitals.put("Delaware", "Dover");
		stateCapitals.put("Hawaii", "Honolulu");
		
		// Display all states (keys)
		System.out.println("STATES:\n-----------");
		
		Set<String> keys = stateCapitals.keySet();
		
		for (String k : keys)
			System.out.println(k);
		
		// Display all capitals (values)
		System.out.println("\nCAPITALS:\n-----------");
		
		for (String k : keys)
			System.out.println(stateCapitals.get(k));
		
		// Display state-capital pairs (key-value)
		System.out.println("\nSTATE - CAPITAL PAIRS:\n----------------------");
		for (String k : keys)
			System.out.println(k + " - " + stateCapitals.get(k));
		
	}

}
