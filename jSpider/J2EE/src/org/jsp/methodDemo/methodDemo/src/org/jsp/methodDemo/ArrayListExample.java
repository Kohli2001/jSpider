package org.jsp.methodDemo;

import java.util.ArrayList;

public class ArrayListExample {
	
	 public static void main(String args[]){  
	  ArrayList list=new ArrayList(); //Creating arraylist    
	      list.add("4");  //Adding object in arraylist    
	      list.add(5);    
	      list.add(9.00);    
	      list.add("10"); 
	      Double element =(Double)list.get(2); 
	    System.out.println(element);
	    for (Object ele : list) {
			System.out.println(ele);
		}
	    
	}
}

