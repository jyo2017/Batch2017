package advancejava;

public class constructor {
	constructor()
	{
		System.out.println("constructor1");
	}
	constructor(float f)
	{
		System.out.println("float value");
	}

	public static void main(String[] args) {
		
		// 
		constructor c=new constructor();
		constructor c1=new constructor(10.12f);
		//System.out.println(c1);

	}

}
