package inheritance;
//3)WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,
//stop(),run() all method return string type of value. 
//Create class car which extends Vehicle implement accelerate(long mph)differently in car class.
class car extends Vehicle{
	public String acceletate(long mph)
	{
		return "mph of car is "+mph;
	}
}
public class Vehicle {
	public String acceletate(long mph)
	{
		return "mph of Vehicle is "+mph;
	}
	public String stop()
	{
		return "Vehicle Stop";
	}
	public String run()
	{
		return "Vehicle start";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj=new Vehicle();
		System.out.println(obj.acceletate(254));
	}

}
