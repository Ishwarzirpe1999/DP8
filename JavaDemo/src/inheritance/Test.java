package inheritance;
class Parent
{
	int n=20;
	public void m1()
	{
		System.out.println("Parent");
	}
	public void m2()
	{
		System.out.println("Parent class method");
	}
}
class Child extends Parent
{
	int n=10;
	public void m1()
	{
		System.out.println("Child");
	}
	public void m3()
	{
		System.out.println("_child class method________");
	}
	public void showN()
	{
		System.out.println(this.n);
		System.out.println(super.n);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj=new Child();
		obj.m1();
		obj.m2();
		//obj.m3();
		Child obj1=new Child();
		obj1.m1();
		obj1.m2();
		obj1.m3();
	System.out.println(obj.n);
	obj1.showN();
	//obj1.n;
	
	}

}
