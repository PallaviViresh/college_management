package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "lecture")
public class dtoltr {
	@Id
    private String email;
	private String password;
	private String dept;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
