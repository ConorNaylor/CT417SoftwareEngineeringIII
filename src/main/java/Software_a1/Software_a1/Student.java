package Software_a1.Software_a1;

import java.util.Date;

public class Student {
	
	//variable fields
	private String name, userName;
	private int age;
	private static int id = 1000;
	private Date dob;
	
	//Constructor Method
	public Student(String name, int age, Date dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		setUserName();
		id++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setUserName() {
		userName = (name + "" + age);
	}

	public String getUserName() {
		return userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
