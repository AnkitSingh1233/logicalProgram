package com.nt.Instance;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class NewInstanceMethodTest {
	
	
	public static void main(String[] args)throws Exception {
		
		Class c=Class.forName(args[0]);
		
		
		Constructor cons[]=c.getDeclaredConstructors();
		
		Object obj=cons[0].newInstance();
		
		System.out.println(obj.toString());
		
		System.out.println("-----------------");
		
		Object obj1=cons[1].newInstance(10,20);
		System.out.println(obj1.toString());
		
		
		Field[] fields=obj1.getClass().getDeclaredFields();
		
		fields[0].setAccessible(true);
		fields[1].setAccessible(true);
		
		fields[0].setInt(obj1,3000);
		fields[1].setInt(obj1,4000);
		
		System.out.println(obj1.toString());
		
		
		
	}

}
