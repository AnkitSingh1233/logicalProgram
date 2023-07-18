package com.nt.access;

public class Access {



	public static void main(String[] args) {

		
           int[] arr= {5,2,1,4,6,3,8,7};
           
           for(int i=0;i<arr.length-1;i++) {
        	   
        	   for(int j=0;j<arr.length-1-i;j++) {
        		   
        		   if(arr[j]>arr[j+1]) {
        			   
        			   int temp=arr[j+1];
        			    arr[j+1]=arr[j];
                        arr[j]=temp;        			    
        		   }
        		   
        	   }
        	   
        	   
           }
		for(int i:arr) {
			System.out.println(i);
		}
		
		


	}

}
