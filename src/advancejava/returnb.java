package advancejava;

public class returnb {

	/*public boolean verify(int a,int b)
	{
		if(a==b)
		{
			return true;
		}
		else
			return false;
		
	}*/
	public boolean verify(int a,int b)
	{
		boolean c=a>b;
		return c;
		
	}


	public static void main(String[] args) {
		// 
		returnb r=new returnb();
		/*boolean g=r.verify(10, 15);
		System.out.println(g);*/
		boolean b=r.verify(10, 7);
		System.out.println(b);
		

	}

}
