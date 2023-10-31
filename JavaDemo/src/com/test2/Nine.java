package com.test2;
class C{
	static int i=6;
	static {
		i=i-- - --i;
	}
}
class B extends C
{
	static {
		i=--i - i--;
	}
}
public class Nine  {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.i);
	}
	
}

