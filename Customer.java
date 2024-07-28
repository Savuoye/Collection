package com.infotech.fisglobal;

public class Customer {

	private int custNo;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String profession;
	private String contactNo;
	private String emailId;
	private String city;
	private String state;
	private String isActive;

	public Customer(int custNo, String firstName, String lastName, String gender, int age, String profession,
			String contactNo, String emailId, String city, String state, String isActive) {
		super();
		this.custNo = custNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.profession = profession;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.city = city;
		this.state = state;
		this.isActive = isActive;
	}

	public Customer() {
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", age=" + age + ", profession=" + profession + ", contactNo=" + contactNo + ", emailId="
				+ emailId + ", city=" + city + ", state=" + state + ", isActive=" + isActive + "]";
	}

}
