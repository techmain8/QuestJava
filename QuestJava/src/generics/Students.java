package generics;

public class Students {

	String name;
	Integer rollno;
	Float percentage;
	public Students(String name, int rollno, float percentage) {
		this.name= name;
		this.rollno =rollno;
		this.percentage=percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
}
