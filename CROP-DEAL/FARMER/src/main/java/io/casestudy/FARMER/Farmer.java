package io.casestudy.FARMER;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Farmer")
public class Farmer {
	
	    private String id;
	    private String firstName;
	    private String lastName;
	    private String password;
	    private String gender;
	    private String email;
	    private Date dob;
	    private String address;
	    private Long MobileNumber;
	    private String PaymentInfo;
	    private Boolean Status;
	    
	    public Farmer() {
			super();
		}
	    
	    
		public Farmer(String id, String firstName, String lastName, String password, String gender, String email,
				Date dob, String address, Long mobileNumber, String paymentInfo, Boolean status) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
			this.gender = gender;
			this.email = email;
			this.dob = dob;
			this.address = address;
			MobileNumber = mobileNumber;
			PaymentInfo = paymentInfo;
			Status = status;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Long getMobileNumber() {
			return MobileNumber;
		}
		public void setMobileNumber(Long mobileNumber) {
			MobileNumber = mobileNumber;
		}
		public String getPaymentInfo() {
			return PaymentInfo;
		}
		public void setPaymentInfo(String paymentInfo) {
			PaymentInfo = paymentInfo;
		}
		public Boolean getStatus() {
			return Status;
		}
		public void setStatus(Boolean status) {
			Status = status;
		}
}