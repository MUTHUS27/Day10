package org.userdefinedException;

import java.util.ArrayList;
import java.util.List;

public class A {

	
	
	public static void main(String[] args) throws KarthicNotFoundException {
		
		
		
		String s="Karthic";
		
		if(s.equals("Karthic")) {
			System.out.println("Hello Master Karthic");
		}
		
		else {
			throw new KarthicNotFoundException();
			}
		
		
//List li = new ArrayList();
//		 li.add(100);
//		 li.add("ruth");
//		 li.add(10);
//		 System.out.println(li.get(6));
//		
//Object object = li.get(0);	
		
		
		
	}
	
	
	
}
