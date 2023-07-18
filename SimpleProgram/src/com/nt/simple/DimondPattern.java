package com.nt.simple;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;




public class DimondPattern {

	 int x=10;
	 int y=20;
	 
	 
	
	   public DimondPattern() {
		   //super(10,20);
	}
	
	
	public DimondPattern(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
	}


	public static void main(String ar[]) {

		
		DimondPattern dp=new DimondPattern();
		System.out.println(dp.x+"       "+dp.y);
		
		
		
		/*
		 * HashMap<String,Integer> map=new HashMap<>(); map.put("Ankt",12);
		 * map.put("Ait",1); map.put("Anki",9); map.put("nkit",3);
		 * map.entrySet().stream().sorted((c1, c2) ->
		 * c2.getValue().compareTo(c1.getValue())).forEach(System.out::println);;
		 * //map.entrySet().stream().map((e)->e.getKey().replace('A',
		 * 'S').forEach(System.out::println);
		 */

		/*
		 * for(int i=1;i<=5;i++) {
		 * 
		 * 
		 * for(int j=i;j<=5;j++) { System.out.print(" "); } for(int k=1;k<=2*i-1;k++) {
		 * if(k==2*i-1||i==5||k==1) { System.out.print("*"); } else {
		 * System.out.print(" "); }
		 * 
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */

		int x = 9;
		if (x == 9) {
			x = 8;
			System.out.println(x);
		}

	}

}
