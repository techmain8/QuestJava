package objectIO;

import java.io.Serializable;

public class Student implements Serializable
{
	private String name;
	private int age;
	private int rollNo;
	private float score;
	private boolean isMoniter;
	
	public Student(String name, int age, int rollNo, float score, boolean isMoniter) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.score = score;
		this.isMoniter = isMoniter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public boolean isMoniter() {
		return isMoniter;
	}

	public void setMoniter(boolean isMoniter) {
		this.isMoniter = isMoniter;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", score=" + score ;
	}
	
}
