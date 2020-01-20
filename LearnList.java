package javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LearnList {

	public static void main(String[] args) {
		
		/*char[] abc = new char[3];
		
		abc[0] = 'A';
		abc[1] = 'B';
		abc[2] = 'C';

		
		Scanner input = new Scanner(System.in);
		abc[0] = input.next().charAt(0);*/
		
		/*ArrayList<String> students = new ArrayList<String>();
		//CollectionName<objDataType> = new CollectionName<objDataType();
		students.add("James");
		students.add("Tim");
		students.add("Tom");
		students.add("Tommy");
		students.add("Timmy");
		students.add("Tam");
		
		students.remove(3);
		//to remove an array from ArrayList
		System.out.println(students.get(2));
		//to print ArrayList use .get
		System.out.println(students.size());
		
		//to print out everything in the ArrayList use for loop or for each loop.
		for(int i=0; i<students.size() ;i++) {
			System.out.println(students.get(i));
		}
			
		for(String a :students) {
			System.out.println(a);
		}*/
		
		//difference between Linked and ArrayList is the architecture
		LinkedList<String> students = new LinkedList<String>();
		students.add("James");
		students.add("Tim");
		students.add("Tom");
		students.add("Tommy");
		students.add("Timmy");
		students.add("Tam");
		
		System.out.println(students);
		students.remove(3);
		//to remove an array from ArrayList
		System.out.println(students.get(2));
		//to print ArrayList use .get
		System.out.println(students.size());
		
		//to print out everything in the ArrayList use for loop or for each loop.
		for(int i=0; i<students.size() ;i++) {
			System.out.println(students.get(i));
		}
			
		for(String a :students) {
			System.out.println(a);
		}
		
		
	}	
	//Array: List of Data, Static (Holds fixed number of values)
	//ArraryList (Dynamic Array)
}
