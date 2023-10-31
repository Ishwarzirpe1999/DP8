
package inheritance;
//WAP to create class Programmer with Method workingHours().
//create class Employee which extends Programmer implement workingHours()differently in child.
class Employee3 extends Programmer
{
	public int woringHours()
	{
		int s=super.workingHours()+4;
		return s;
	}
}
public class Programmer {
	public int workingHours()
	{
		return 12;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
