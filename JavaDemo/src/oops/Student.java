package oops;

//
public class Student {
	int sid, marathi, english, math, history, hindi;
	long contact;
	String sname, email,grade;
	double percentage;
	

	public void percentage() {
		
		percentage= (marathi + english + math + history + hindi) / 5;
		
	}
	public void grade()
	{
		
	}

	public void setData(int id, int mar, int eng, int m, int his, int hin, long cnt, String name, String e) {
		System.out.println("in setData");
		sid = id;
		marathi = mar;
		english = eng;
		math = m;
		history = his;
		hindi = hin;
		contact = cnt;
		sname = name;
		email = e;
	
	}

	public void display() {
		System.out.println("Student roll no is " + sid);
		System.out.println("Student name is " + sname);
		System.out.println("Student contact number is " + contact);
		System.out.println("Student email id is" + email);
		System.out.println("Student get marks in marathi are " + marathi);
		System.out.println("Student get marks in english are " + english);
		System.out.println("Student get marks in math are " + math);
		System.out.println("Student get marks in history are " + history);
		System.out.println("Student get marks in hindi are " + hindi);
		System.out.println("Student get percentage " +percentage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setData(1, 56, 67, 54, 98, 67, 7385498062l, "Ishwar", "ishwar@gmail.com");
		obj.percentage();
		obj.display();
	}

}
