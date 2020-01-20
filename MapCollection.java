package javaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		//map must have two variables in this example we use: Integer and String. (Key and Value)
		Map<Integer,String> hm = new HashMap<Integer,String>();
		//how to add items to the map
		hm.put(10,"Ten");
		hm.put(20,"Twenty");
		hm.put(30,"Thirty");
		hm.put(40,"Fourty");
		hm.put(50,"Fifty");
		hm.put(60, "Fifty");
		//duplicated keys will NOT show up when printed, however values can remain the same.
		hm.put(10, "DupTen");
		//print out the map using the Key, and we will get the value for said key.
		System.out.println(hm.get(50));
		//printing out "hm" will give us everything in the map. (prints in random order)
		System.out.println(hm);
		System.out.println("==========LinkedHashMap=========");
		
		Map<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		//how to add items to the map
		lhm.put(10,"Ten");
		lhm.put(20,"Twenty");
		lhm.put(30,"Thirty");
		lhm.put(40,"Fourty");
		lhm.put(50,"Fifty");
		lhm.put(60, "Fifty");
		//duplicated keys will NOT show up when printed, however values can remain the same.
		lhm.put(10, "DupTen");
		//print out the map using the Key, and we will get the value for said key.
		System.out.println(lhm.get(50));
		//printing out "hm" will give us everything in the map. (prints in random order)
		System.out.println(lhm);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
