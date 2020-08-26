package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<>();
		scores.put(new Integer(87), new String("최재영"));
		scores.put(new Integer(98), new String("민해주"));
		scores.put(new Integer(75), new String("김상민"));
		scores.put(new Integer(95), new String("최형준"));
		scores.put(new Integer(80), new String("허성준"));
		
		Map.Entry<Integer,String> entry = scores.firstEntry();
		System.out.println("점수: "+entry.getKey()+"이름:"+entry.getValue());
		
		
		
		Integer icnt = scores.firstKey();
		System.out.println("점수:"+icnt + ", 이름:"+scores.get(icnt));
		
		
		
		Map.Entry<Integer,String> pEntry = scores.pollFirstEntry();
		
		
		
	}
}
