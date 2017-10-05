package Software_a1.Software_a1;

import java.util.LinkedList;

public class Module {
	
	private String name;
	private String id;
	private LinkedList<Student> Students;
	
	public Module(String name, LinkedList <Student> list, String id) {
		this.name = name;
		this.id = id;
		this.Students = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LinkedList<Student> getList() {
		return Students;
	}
	
	public void addStudent(Student student) {
		Students.add(student);
	}

}
