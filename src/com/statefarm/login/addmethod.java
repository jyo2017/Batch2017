package com.statefarm.login;

public class addmethod {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// method
		addmethod a=new addmethod();
		a.add(10, 10);

	}

}
