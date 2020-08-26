package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		
		Integer t = tSet.first();
		t = tSet.last();
//		t = tSet.floor(new Integer(87));//87기준으로 작거나 같은 값
//		t = tSet.lower(new Integer(87)); // 87제외한 작은 값
//		t = tSet.ceiling(new Integer(85));//85보다 크거나 같은 값
//		t = tSet.higher(new Integer(85));//85보다 큰 값
//		
		
//		Iterator<Integer> dIter =  tSet.descendingIterator();//반복자:Iterator 타입:<Integer>
//		while(dIter.hasNext()) {
//			System.out.println(dIter.next());
//		}

		
		
		NavigableSet<Integer> nSet = tSet.descendingSet();
		for(Integer icnt : nSet) {
			System.out.println(icnt);
		}
		
		
		
		
		
//		int size = tSet.size();
//		for(int i=0;i<size;i++) {		
//			t = tSet.pollLast(); //요소를 가지고 오고 삭제
//			System.out.println(t + "," + tSet.size());
//		}
//			
		
		
//		//System.out.println(t);
//		
//		Iterator<Integer> iter = tSet.iterator();
//		while(iter.hasNext()) {
//			Integer icnt = iter.next();
//			//System.out.println(icnt);
//		}
//	
	
	
	
	
	
		
		
		
		
		
		
		
	}//end of main
}
