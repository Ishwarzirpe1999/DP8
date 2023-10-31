package com.abstracts;
class Elephant extends Animal
{
	void eat()
	{
		System.out.println("Elephant eat");
	}
}
class Tiger extends Animal{
	void eat()
	{
		System.out.println("Tiger eat");
	}
}
abstract class Animal {

	abstract void eat(); 
}
