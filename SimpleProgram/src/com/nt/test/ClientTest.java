package com.nt.test;

import java.io.IOException;
import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.sql.Date;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface wishMessage {

	// public void show(String message);

	public int sum(int a, int b);
}

class ClientTest {

	private static Stream<Entry<Integer, String>> String;

	public static void main(String[] args) throws URISyntaxException, IOException {


		//HashMap<Integer,String> map=new HashMap<>();
		//map.put(1,"Ankit");
		//map.put(2,"Ankur");
		
		//map.forEach((k,v)->System.out.println(k+"   "+v));

		//Stream<Map.Entry<Integer,String>> entry=map.entrySet().stream();
		
		
		//entry.forEach(entry1->System.out.println(entry1.getKey()+"  "+entry1.getValue()));
		
		//System.out.println(map.get(1));
		
		//System.out.println(map.keySet());

		/*
		 * Map<Integer,String> map=new HashMap<>(); map.put(1,"Ankit");
		 * map.put(2,"Ankur"); map.put(3,"Prateek");
		 * 
		 * Map<Integer, String>
		 * result=map.entrySet().stream().filter(x->x.getKey()==2).collect(Collectors.
		 * toMap(x->x.getKey(), x->x.getValue())); System.out.println(result);
		 */
		
		/*
		 * List<Integer> list=new ArrayList<>(); list.add(10); list.add(20);
		 * list.add(23);
		 * 
		 * List<Integer>
		 * listre=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		 * System.out.println(listre);
		 */
		
		

		/*
		 * HashSet<Integer>set = new HashSet<Integer>(list1); List<Integer>list2 = new
		 * ArrayList<Integer>(set);
		 * System.out.println("List after removing duplicate elements:");
		 * 
		 * for (Object ob: list2) System.out.println(ob);
		 * 
		 * list2.forEach(System.out::println);
		 *//*
			 * Stream<Integer> list2=list1.stream().distinct(); System.out.println(list2);
			 */
		//list2.forEach(System.out::println);
		
		
		

	}

}

/*
 * for(int i=5;i>=1;i--) {
 * 
 * 
 * for(int j=5;j>=i;j--){
 * 
 * System.out.print(" "); }
 * 
 * for(int j=1;j<=2*i-1;j++) { System.out.print("*"); } System.out.println(); }
 */
