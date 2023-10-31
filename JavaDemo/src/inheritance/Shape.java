package inheritance;

//WAP to create class shape with method draw().
//create class circle, square, Rectangle which 
//extends Shape implement draw() differently in each child.
class Square extends Shape {
	public void draw() {
		System.out.println("I am in Square");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("I am in Circle");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("I am in Rectangle");
	}
}

public class Shape {
	public void draw() {
		System.out.println("I am in shape");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = new Rectangle();
		Shape obj1 = new Circle();

		Shape obj3 = obj1;

		System.out.println(obj1.hashCode());

		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj1));

		System.out.println(obj3.equals(obj1));

		if (obj instanceof Circle) {
			obj.draw();
		}
		if (obj instanceof Rectangle) {
			obj.draw();
		}

	}

}
