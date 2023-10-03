package org.ncu.hireWheels.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="user")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	 @Column(nullable = false, length = 50)
	private String firstName;
	 
	 @Column(length = 50)
	private String lastName;
	
	@Column(nullable = false, length = 50)
	private String password;
	
	@Column(nullable = false, unique = true, length = 50)
	private String email;
	
	@Column(nullable = false, unique = true, length = 10)
	private char mobileNo;
	
	 @ManyToOne
	 @JoinColumn(name = "role_id", nullable = false)
	private Role roleId;
	private int walletMoney;
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", email=" + email + ", mobileNo=" + mobileNo + ", roleId=" + roleId + ", walletMoney="
				+ walletMoney + "]";
	}
	public Users(int userId, String firstName, String lastName, String password, String email, char mobileNo,
			Role roleId, int walletMoney) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.mobileNo = mobileNo;
		this.roleId = roleId;
		this.walletMoney = walletMoney;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(char mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Role getRoleId() {
		return roleId;
	}
	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}
	public int getWalletMoney() {
		return walletMoney;
	}
	public void setWalletMoney(int walletMoney) {
		this.walletMoney = walletMoney;
	}
}
