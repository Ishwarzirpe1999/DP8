package com.abstracts;

public class Juicer extends Machine{
	public void crush()
	{
		System.out.println("Hiii");
	}
	public void filter()
	{
		System.out.println("Filter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juicer obj =new Juicer();
		obj.crush();
		obj.filter();
		obj.rotate();
		Machine m=new Juicer();
		m.crush();
		//m.filter();
	}

}
