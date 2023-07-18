package com.nt.simple;

public class ThreadA {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB t1=new ThreadB();
	       t1.start();
	       
	      synchronized (t1) {
			
	    	  t1.wait();
	    	  System.out.println(t1.sum);
	    	  
		}
	       
		
	}

}


class ThreadB extends Thread{
	   int sum=0;
	
	public void run() {
	
		synchronized (this) {
			
			for(int i=1;i<=100;i++) {
				
				sum=sum+i;
			}
			
			this.notify();	
		}
		
		
		
	}
	
	
	
}///////////////////////////////////////////////////////