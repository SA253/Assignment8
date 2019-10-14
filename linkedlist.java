package assignment;

import java.util.*;
import java.util.LinkedList;

import java.util.ListIterator;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("sharmi");
		li.add("sharma");
		li.add("chowdary");
		
		System.out.println(li);
		li.addLast("amilineni"); /*append element at last position*/
		
			System.out.println(li);
			
			System.out.println("element removed:"+ " "+li.removeFirst());/*removing element and displaying*/
			System.out.println("after removing element"+li);
			
			String p = li.peekLast(); /*display last element without removing*/
			System.out.println("last element:"+" "+p);
			System.out.println("array"+li);
			
			ListIterator lter = li.listIterator(2); /* iteration from specific position*/
			while(lter.hasNext())
				System.out.println(lter.next());
			
			Iterator<String>it = li.descendingIterator(); /*revese iteration*/
			while(it.hasNext())
				System.out.println(it.next());
}
}