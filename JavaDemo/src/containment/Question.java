package containment;

public class Question {
	int id;
	String name;
																																																																																																																																																																																																																																																																																																																																																																									
	Question() {
		id = 0;
		name = "";
	}

	public Question(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Question [id=" + id + ", Question=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question a = new Question(1, "Name of the animal");
		System.out.println(a);
	}

}
