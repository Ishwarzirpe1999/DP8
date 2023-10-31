package oops;

public class EmployeeStatic {
	static int count=0;
	private int id;
	private String name;
	private float salary;
	
	EmployeeStatic(){
		this.id=++count;
	}
	public EmployeeStatic(String name,float salary)
	{
		this();
		this.name=name;
		this.salary=salary;
		
	}
	public String toString()
	{
		return "Id is "+id+" name is "+name+" salary is "+salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeStatic obj=new EmployeeStatic("Ishwar",254454f);
		EmployeeStatic obj1=new EmployeeStatic("prashant",789454f);
		EmployeeStatic obj2=new EmployeeStatic("rushikesh",457454f);
		
	   System.out.println(obj);
	   System.out.println(obj1);
	   System.out.println(obj2);
	  
		
		
	}

}
