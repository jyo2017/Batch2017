package com.statefarm.login;

public class variabletypesample {
	String name;
	public String loc;
	static int zipcode;
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// local variables
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
		variabletypesample v=new variabletypesample();
		//asign the val
		v.name="Sri";
		v.loc="plano";
		System.out.println(v.name);
		System.out.println(v.loc);
		//static
		variabletypesample.zipcode=60545;
		System.out.println(variabletypesample.zipcode);
		//to use method
		v.sub(20,10);

	}

}
