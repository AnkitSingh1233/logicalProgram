package com.nt.Instance;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class A{
	
	public A() throws ArithmeticException{
		System.out.println("A");
	}
	public A(int x) {
		
		System.out.println("x");
	}
	
	
}
class B extends A{
	
	public B() {
		super();
		System.out.println("B");
	}
}



public class Employee {
	public static void main(String[] args) throws Exception {
	
        A a=new B();
        
	
	
	}
}


/*
 * String s="javj";
 * 
 * 
 * Map<Character,Integer> map=new HashMap<>();
 * 
 * for(int i=0;i<s.length();i++) {
 * 
 * char ch=s.charAt(i);
 * 
 * if(map.containsKey(ch)) {
 * 
 * int count=map.get(ch); map.put(ch,++count);
 * 
 * } else{ map.put(ch,1);
 * 
 * }
 * 
 * 
 * 
 * } }
 * 
 * map.entrySet(). forEach(System.out::println);
 * 
 */

/*
 * String s = "This is This is Boy Boy And And A"; String[] words =
 * s.split(" ");
 * 
 * for (int i = 0; i < words.length; i++) {
 * 
 * int count =0; for (int j = i + 1; j < words.length; j++) {
 * 
 * 
 * if(words[i].equals(words[j])) { count++; words[j]="0"; }
 * 
 * }
 * 
 * 
 * if(count>0&&words[i]!="0") System.out.println(words[i]);
 * 
 * }
 */
