package containment;

public class SubTopic {
	int id;
	String name;
	Question q;

	public SubTopic() {
		id = 0;
		name = "";
		q = new Question();

	}

	public SubTopic(int id, String name, Question q) {
		this.id = id;
		this.name = name;
		this.q = q;
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

	public Question getQ() {
		return q;
	}

	public void setQ(Question q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return "SubTopic [id=" + id + ", name=" + name + ", q=" + q + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question b = new Question(11, "Tell me about your fav animal");
		SubTopic a = new SubTopic(101, "Animals", b);
		System.out.println(a);
	}

}
