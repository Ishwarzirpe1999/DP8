package com.expriment;

public class Student {
	private int rollNo;
	public int admissionNO;
	protected int age;
	int courseid;
	
	public void doPublic()
	{
		System.out.println("I am in public");
	}
	void doDefault() {
		System.out.println("I am in default");
	}
	protected void doProtected()
	{
		System.out.println("I am in protectedc");
	}
	private void doPrivate()
	{
		System.out.println("I am in private");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
