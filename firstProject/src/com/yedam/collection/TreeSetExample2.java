package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("hong1",10));
		set.add(new Person("hong2",14));
		set.add(new Person("hong3",12));
		set.add(new Person("hong4",11));
	
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().name+","+iter.next().age);
		}
		
		SortedSet<Person> sSet = set.headSet(new Person("Sorted",13));
		sSet = set.tailSet(new Person("So",12));	
		for(Person person : sSet) {
			System.out.println(person.name+","+person.age);
		}
		System.out.println("----------------------------");
		
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted",12),false);
		for(Person person : nSet) {
			System.out.println(person.name+","+person.age);
		}
		
	
	}

}
