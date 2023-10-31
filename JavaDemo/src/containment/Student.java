package containment;

public class Student {
	int srollno;
	String sname;
	Department dept;

	Student() {
		srollno = 0;
		sname = " ";
		dept = new Department();
	}

	public Student(int rollno, String name, Department dep) {
		this.srollno = rollno;
		this.sname = name;
		this.dept = dep;
	}

	public int getSrollno() {
		return srollno;
	}

	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Student [srollno=" + srollno + ", sname=" + sname + ", dept=" + dept + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1, "Mechanical Engineering");
		Student a = new Student(101, "Ishwar",obj );
		System.out.println(a);

	}

}
