//for getter and setters of laptop 

package gradleCRUD;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid = 1;
	private String lname="DEll";
	
	
	@ManyToMany
	private List<StudentGradle> studentgradle = new ArrayList<StudentGradle>();
	
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
	public List<StudentGradle> getStudentgradle() {
		return studentgradle;
	}
	public void setStudentgradle(List<StudentGradle> studentgradle) {
		this.studentgradle = studentgradle;
	}
		
}
