package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_Data 
{
	@Id
	long mobile_No;
	String first_name;
	String email;
	String password;

	public String getFirst_name() 
	{
		return first_name;
	}

	public void setFirst_name(String first_name) 
	{
		this.first_name = first_name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public long getMobile_No() 
	{
		return mobile_No;
	}

	public void setMobile_No(long mobile_No) 
	{
		this.mobile_No = mobile_No;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	@Override
	public String toString() 
	{
		return "User_Data [mobile_No=" + mobile_No + ", first_name=" + first_name + ", email=" + email + ", password="
				+ password + "]";
	}
	
	

}
