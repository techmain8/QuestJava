package assessment04;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable
{
	private int userid;
	private String password;
	private String firstname;
	private String lastname;
	private int age;
	
	
	public User(int userid, String password, String firstname, String lastname, int age) {
		super();
		this.userid = userid;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return " userid=" + userid + " \n password=" + password + "\n firstname=" + firstname + "\n lastname="
				+ lastname + "\n age=" + age ;
	}
	
	
}
