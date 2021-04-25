package kodlamaio_classes;

public class Category {
	
	public Category()
	{
		System.out.println("Category Added");
	}

	public Category(String name)
	{
		this.name=name;
		System.out.println(name+" Category Added");
	}

	int id;
	String name;

}
