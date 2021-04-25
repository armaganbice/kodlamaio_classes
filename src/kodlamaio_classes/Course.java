package kodlamaio_classes;

public class Course {
	
	public Course()
	{
	//System.out.println(name+" add");
	}
	public Course(int id,int categoryId,String name,String instructorName,int completionRate)
	{
		this.id=id;
		this.categoryId=categoryId;
		this.name=name;
		this.instructorName=instructorName;
		this.completionRate=completionRate;
		System.out.println(name+" Course added");
	}
	
	int    id;
	int    categoryId;
	String name;
    String instructorName;
    int completionRate;
}
