package Entities;

import java.time.LocalDate;

import Abstract.BaseGameManager;
import Abstract.Entity;

public class Client implements Entity{

	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String nationalityId;
	private String password;
	
	public Client() {
		
	}

	public Client(String firstName, String lastName, int yearOfBirth, String nationalityId, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationalityId = nationalityId;
		this.password = password;
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

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	public String getId() {
		return getFirstName().charAt(0) + getNationalityId();
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getAge() {
		return (2021 - yearOfBirth);
	}
}

