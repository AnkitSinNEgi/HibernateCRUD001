package gradleCRUD;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class StudentGradle implements Serializable{
	
	@Id
	private int id;
	private String name;
	private String city;
	
	@ManyToMany(mappedBy="laptop")
	private List<Laptop> laptop=new ArrayList<Laptop>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//getter setter for laptop
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
	//for retreving TEl
	@Override
	public String toString() {
		return"StudentGradle [id="+id+",name="+name+",city="+city+"]";
		
	}
	
}
