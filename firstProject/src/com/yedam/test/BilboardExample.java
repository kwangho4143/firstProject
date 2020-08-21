package com.yedam.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

import com.yedam.classes.Person;
import com.yedam.generic.Container;
import com.yedam.generic.Product;

import java.util.InputMismatchException;

public class BilboardExample {

	public static boolean getAge(Map<String,Integer> m) {
		
		Set<String> set = m.keySet();
		for(String i : set) {
			Integer k = m.get(i);
			System.out.println(i+","+k);
		}

	}

	public static void main(String[] args) {

		boolean run = true;
		Scanner scn = new Scanner(System.in);
		BilService service = new BilServiceImpl();
		while (run) {

			Map<String, Integer> connedimfo = new HashMap<>();
			connedimfo.put("kwangho", 1111);
			connedimfo.put("kwang", 1234);
			connedimfo.put("kw", 4321);
			connedimfo.put("kwh", 3123);

			Map<String,Integer> connimfo = new HashMap<>();
			System.out.println("계정ID를 입력하시오");
			String useredID = scn.nextLine();
			System.out.println("계정PW를 입력하시오");
			int useredPW = scn.nextInt();scn.nextLine();
			connedimfo.put(useredID,useredPW);
			
			if() {
				
			}
			else {
				System.out.println("다시 계정을 확인하시오");
				continue;
			}
				



	}// main end

}// class end
