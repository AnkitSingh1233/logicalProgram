
package com.nt.simple;



    public class B {
    	
    	
    	int []queue=new int[5];
    	int front,rear,size;
    	
    	
    	public int deque() {
    		  int data=  queue[front];
    		   front=(front+1)%5;
    		   size--;
    		  
    		return data;
    	}
    	
    	
    	public void enqueue(int data) {
    		
    		queue[rear]=data;
    	  rear=(rear+1)%5;
    	  size++;
    	}
    	public void show() {
    		for(int i=0;i<size;i++) {
    			
    			System.out.print(queue[(front+i)%5]+" ");
    		}
    	}
    	
  
	
	
	public static void main(String[] args) {
		B b=new B();
		b.enqueue(7);
		b.enqueue(8);
		b.enqueue(1);
		b.enqueue(4);
		
	b.deque();
	b.deque();
	
	b.enqueue(8);
	b.enqueue(1);
	b.enqueue(4);

		
		b.show();
      
	}
	
	
}
