
package oops;

public class MethodOverloading {
	public void add(int i,int j)
	{
		System.out.println("Addition (int,int)"+(i+j));
	}
	public void add(int f1,float f2)
	{
		System.out.println("Addition="+(f1+f2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.add(12, 12.2f);
		obj.add(45, 87);
	}

}
