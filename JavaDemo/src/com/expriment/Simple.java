package com.expriment;
class A{
	private int data=40;
	 A() {
		
	}
	
	 void msg()
	{
		System.out.println("Hello Java");
	}
}
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		//System.out.println(obj.data);    //compile time error
		
		//obj.msg();     //compile time error
	}

}
