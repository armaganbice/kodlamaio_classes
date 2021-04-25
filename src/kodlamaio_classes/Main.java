package kodlamaio_classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category category=new Category("Programlama");
		
		Course[] courses;
		Course course1=new Course();
		course1.id=1;
		course1.categoryId=1;
		course1.name="Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		course1.instructorName="Engin Demiroð";
		course1.completionRate=100;

		Course course2=new Course();
		course2.id=2;
		course2.categoryId=1;
		course2.name="Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		course2.instructorName="Engin Demiroð";
		course2.completionRate=28;
		
		Course course3=new Course();
		course3.id=3;
		course3.categoryId=1;
		course3.name="Programlamaya Giriþ için Temel Kurs";
		course3.instructorName="Engin Demiroð";
		course3.completionRate=100;
		
		CourseManager courseManager=new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Add(course3);
	}

}
