/*
 * Alex vergara
 * Professor Jackson
 * Date: 2/14/2021
 * JSF Application
 * THIS IS MY OWN WORK
 * 
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {
	
	//DATA VALIDATION
	// first name
	@NotNull(message = "Please Enter a name")
	@Size(min=5 , max=20)
	private String firstName;
	//DATA VALIDATION
	// lastname
	@NotNull(message = "Please Enter a lastName")
	@Size(min=5 , max=20)
	private String lastName;
	
	//constructor
	public User() {
		firstName = "alex";
		lastName = "vergara";
		
	}
	
	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
