package br.com.java.exception;

public class VirtualMachineDead {
	public static void main( String[] args ) {
	    foo();
	}
	public static void foo() {
	    foo();
	}
}
