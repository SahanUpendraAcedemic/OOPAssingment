package user;

public class User {
	private int uid;
	private String fullname;
	private String phone;
	private String username;
	private String password;
	private String address;
	private String gender;
	
	public User(int uid, String fullname, String phone, String username, String password, String address,
			String gender) {
		super();
		this.uid = uid;
		this.fullname = fullname;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.address = address;
		this.gender = gender;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
