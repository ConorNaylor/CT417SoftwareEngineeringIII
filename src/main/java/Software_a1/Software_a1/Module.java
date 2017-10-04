package Software_a1.Software_a1;

import java.util.LinkedList;

public class Module {
	
	private String name;
	private static int id = 10000;
	private LinkedList<Student> list;
	
	public Module(String name, LinkedList <Student> list) {
		this.name = name;
		id++;
		this.list = list;
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
	public LinkedList getList() {
		return list;
	}
	
	public void addStudent(Student student) {
		list.add(student);
	}

}
