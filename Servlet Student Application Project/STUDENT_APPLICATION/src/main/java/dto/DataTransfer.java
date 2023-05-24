package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DataTransfer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Id;
	String Name;
	String Middle_name;
	String Last_name;
	String Father_name;
	String Mother_name;
	String Email;
	String Passsword;
	long Mobile_No;
	String Gender;
	Date Date_of_Birth;
	double Tenth_per;
	double Twelveth_Diploma_per;
	double Degree_per;
	String College_name;
	String Address;

}
