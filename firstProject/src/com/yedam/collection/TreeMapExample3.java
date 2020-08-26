package com.yedam.collection;

import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<Student,String > tMap = new TreeMap<>();
		tMap.put(new Student("Hong",69,79),"체육특기생");
		tMap.put(new Student("park",78,88),"일반학생");
		tMap.put(new Student("Choi",85,79),"체육특기생");
		tMap.put(new Student("Kim",90,86),"일반학생");
		

//		NavigableMap<Student,String>sMap = tMap.headMap(new Student("Hong",80,79),true); //80점 이하 가져오기 
//		Set<Student> set = sMap.keySet();
//		for(Student s : set) {
//			System.out.println(s.getName()+","+s.getEngScore());
//		}
		
//		SortedMap<Student,String>sMap2 = tMap.tailMap(new Student("Hong",80,79)); //80점 이상 가져오기
//		Set<Student> set2 = sMap2.keySet();
//		for(Student s : set2) {
//			System.out.println(s.getName()+","+s.getEngScore());
//		}
		
		
		
		SortedMap<Student,String>sMap3 = tMap.subMap(new Student("Hong",70,79),new Student("Hong",80,79)); //70에서 80사이
		Set<Student> set3 = sMap3.keySet();
		for(Student s : set3) {
			System.out.println(s.getName()+","+s.getMathScore());
		}
	
		
		
		
	}
}
