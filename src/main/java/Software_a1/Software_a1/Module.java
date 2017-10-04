package Software_a1.Software_a1;

import java.util.List;

public class Module {
	
	private String name;
	private int id;
	private List<Student> list;
	
	public Module(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List getList() {
		return list;
	}
	
	public void addStudent(Student student) {
		list.add(student);
	}

}
