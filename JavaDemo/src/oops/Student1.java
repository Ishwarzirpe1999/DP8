package oops;

public class Student1 {
	int id;
	String name;
	public void setId(int i)
	{
		id=i;
	}
	public void setName(String nam)
	{
		name=nam;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void display()
	{
		System.out.println("student id is"+getId());
		System.out.println("student name is "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 obj=new Student1();
		obj.setId(21);
		obj.setName("Ishwar");
		obj.display();
//		obj.setId(225);
//		obj.display();
	}

}
