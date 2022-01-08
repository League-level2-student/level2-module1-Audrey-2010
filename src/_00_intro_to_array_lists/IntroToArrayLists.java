package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList <String> words = new ArrayList<String>();
		//2. Add five Strings to your list
words.add("yarn");
words.add("twine");
words.add("rope");
words.add("thread");
words.add("strand");

		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<words.size(); i++) {
			String s = words.get(i);
			System.out.println(  i + " " + s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s:words) {
			System.out.println(s);
		}
		System.out.println("");
		for(int i = 0; i<words.size(); i++) {
			if(i%2==0) {
				String s = words.get(i);
				System.out.println(s);
			}
		}
		System.out.println("");
		
		//6. Print all the Strings in reverse order.
		for(int i = words.size(); i<1; i--) {
			String s = words.get(i);
			System.out.println(s);
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i<words.size(); i++) {
			String s =words.get(i);
			if(words.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
