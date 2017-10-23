package advancejava;

public class thiskeyword {
	int id;
	String name;
	void display(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(id);
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		//This keyword
		thiskeyword t=new thiskeyword();
		t.display(100, "name");
		
		

	}

}
