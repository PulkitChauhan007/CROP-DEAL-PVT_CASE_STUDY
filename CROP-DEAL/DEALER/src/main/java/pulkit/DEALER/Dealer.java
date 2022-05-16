package pulkit.DEALER;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Dealer")
public class Dealer {
	  private String id;
	    private String firstName;
	    private String lastName;
	    private String password;
	    private Date dob;
	    private String email;
	    private String address;
	    private Long mobileNumber;
	    private String paymentInfo;
	    private Boolean status;
	    
	    
	    public Dealer() {
			super();
		}
	    
		public Dealer(String id, String firstName, String lastName, String password, Date dob, String email,
				String address, Long mobileNumber, String paymentInfo, Boolean status) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
			this.dob = dob;
			this.email = email;
			this.address = address;
			this.mobileNumber = mobileNumber;
			this.paymentInfo = paymentInfo;
			this.status = status;
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
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(Long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getPaymentInfo() {
			return paymentInfo;
		}
		public void setPaymentInfo(String paymentInfo) {
			this.paymentInfo = paymentInfo;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}

}
