package javaCollection;

import java.util.*;

public class SetCollection {

	public static void main(String[] args) {
		
		//Hashset does not like duplicates, Link shows duplicates.
		Set<Integer> grades = new HashSet<>();
		grades.add(55);
		grades.add(85);
		grades.add(75);
		grades.add(11);
		grades.add(95);
		//how to remove something from the hashset
		System.out.println(grades.remove(11));
		System.out.println(grades);
		//lists vertically how many are in the set
		for(int a : grades) {
			System.out.println(a);
		}
		//gives the number of values in the set
		System.out.println(grades.size());
	
		Object[] abc = grades.toArray();
		System.out.println(abc[0]);
		System.out.println(abc[1]);
		System.out.println("========LinkedHashSet========");
	
		//LinkedHashSet maintains the order you created, hashset maintains no particular order.
		Set<Integer> gradesL = new LinkedHashSet<>();
		gradesL.add(55);
		gradesL.add(85);
		gradesL.add(75);
		gradesL.add(11);
		gradesL.add(95);
		//how to remove something from the hashset
		System.out.println(gradesL.remove(11));
		System.out.println(gradesL);
		//lists vertically how many are in the set
		for(int a : gradesL) {
			System.out.println(a);
		}
		//gives the number of values in the set
		System.out.println(gradesL.size());
		System.out.println("===========TreeSet===========");
		
		//TreeSet Orders from least to greatest in the set.
		Set<Integer> gradesT = new TreeSet<>();
		gradesT.add(55);
		gradesT.add(85);
		gradesT.add(75);
		gradesT.add(11);
		gradesT.add(95);
		//how to remove something from the hashset
		System.out.println(gradesT.remove(11));
		//prints everything in the array using "[]"
		System.out.println(gradesT);
		//lists vertically how many are in the set
		for(int a : gradesT) {
			System.out.println(a);
		}
		//gives the number of values in the set
		System.out.println(gradesT.size());
		
	}

}
