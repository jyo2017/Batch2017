package advancejava;

public class example1 {
	int id;
	String name;
	example1(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// using this keyword
		example1 e=new example1(100,"sri");

	}

}
