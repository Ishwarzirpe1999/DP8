package inheritance;

//WAP to create class Bike with fields color ,speed and  method bikeInfo() 
//which is show color and speed of bike .create class Pulsar which extends Bike
//implement bikeInfo() differently child 
class Pulsar extends Bike {
	public Pulsar(String color, double speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}

	public void bikeInfo(String c, double s) {
		System.out.println("color of " + c + " " + s);
	}
}

public class Bike {
	private String color = "red";
	private double speed = 100;

	public Bike(String color, double speed) {
		super();
		// TODO Auto-generated constructor stub
	}

	public void bikeInfo() {
		System.out.println(color + " " + speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike("red",100);
		obj.bikeInfo();
		
	}

}
