//for getter and setters of laptop 

package gradleCRUD;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	private int lid;
	private String lname;
	@ManyToOne
	private StudentGradle studentgradle;
	//getter- setter
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	
	//to fetch data
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
	//getter and setter for student
	public StudentGradle getStudentgradle() {
		return studentgradle;
	}
	public void setStudentgradle(StudentGradle studentgradle) {
		this.studentgradle = studentgradle;
	}
	
	
	
}
