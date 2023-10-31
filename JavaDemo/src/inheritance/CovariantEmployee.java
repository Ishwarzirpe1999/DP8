package inheritance;

class Manager1 extends CovariantEmployee {
	public Manager1 getCovariantEmployee() {
		return new Manager1();
	}
}

public class CovariantEmployee {
public CovariantEmployee getCovariantEmployee()
{
	return new CovariantEmployee();
}
}
