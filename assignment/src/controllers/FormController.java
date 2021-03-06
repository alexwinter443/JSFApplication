/*
 * Alex vergara
 * Professor Jackson
 * Date: 2/14/2021
 * JSF Application
 * THIS IS MY OWN WORK
 * 
 */
package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
public class FormController {

	
	public String onSubmit() {
		//gets the user values from the input form
		FacesContext context = FacesContext.getCurrentInstance();
		User user1 = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		// show the user object data in the console log
		System.out.println("You clicked the submit button");
		System.out.println("The first name is " + user1.getFirstName());
		System.out.println("The last name is " + user1.getLastName());
		
		//put the user object into the post request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user1);
		
		// show the next page
		return "Response.xhtml";
	}
	
}
