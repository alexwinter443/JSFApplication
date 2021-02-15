package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {
	
	@NotNull(message = "Please Enter a name")
	@Size(min=5 , max=20)
	private String firstName;
	
	@NotNull(message = "Please Enter a lastName")
	@Size(min=5 , max=20)
	private String lastName;
	
	public User() {
		firstName = "alex";
		lastName = "vergara";
		
	}
	
	
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
