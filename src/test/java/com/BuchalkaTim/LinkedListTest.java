package com.BuchalkaTim;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class LinkedListTest {
  @Test
  public void f() {
	  /*
		List<String> aList = new ArrayList<String>();
		System.out.println(aList.size());
		aList.add("Front");
		System.out.println(aList.size());
		aList.add("Yonge");
		System.out.println(aList.size());
		aList.add(2, "w");
		System.out.println(aList.size());
		System.out.println(aList.toString());
		*/
		List<String> aList = new LinkedList<String>();
		aList.add("Front");
		aList.add("Yonge");
		aList.add("Tecumseth");
		aList.add("Gladstone");
		aList.add("Secumseth");
		aList.add("Uecumseth");
		aList.add("Tbcumseth");
		Iterator<String> itr = aList.iterator();
		while(itr.hasNext()) {
			//System.out.println("aList : " + itr.next());
			System.out.println("aList : " + itr.next().compareTo("Tecumseth"));
		}
		
		System.out.println("Front exists in the list - " + aList.contains("Front"));
		System.out.println("Fron exists in the list - " + aList.contains("Fron"));
		System.out.println("Bremley exists in the list - " + aList.contains("Bremley"));
		System.out.println("Gladstone exists in the list - " + aList.contains("Gladstone"));
		List<String> bList = aList.subList(0, 2);
		System.out.println(bList.toString());
		System.out.println("Gladstone exists in the list - " + aList.containsAll(bList));
		
  }
}
