package group.G; 

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="users")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private String id;

	private String pass, city;

	
	// Getters Setters
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPass() {
		return this.pass;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}
	// End Getters Setter

	// Constructor
	public UserModel(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}

	public UserModel(String id, String pass, String city) {
		this(id,pass);
		this.city = city;
	}

	public UserModel(String id) {
		this.id = id;
	}
	// End Constructors


	@Override
	public String toString() {
		return "User [" + id +  "," + city + "]"; 
	}
}