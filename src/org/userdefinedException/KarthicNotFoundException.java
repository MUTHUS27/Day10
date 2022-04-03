package org.userdefinedException;

public class KarthicNotFoundException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		String s="the name not match in our records";
		return s;
	}
	
//	public String m1() {
//		// TODO Auto-generated method stub
//		String s="the name not match in our records";
//		return s;
//	}
	
}
