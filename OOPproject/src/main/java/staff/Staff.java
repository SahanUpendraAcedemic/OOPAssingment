package staff;

public class Staff {
	private int sid;
	private String staffname;
	private String post;
	private String phone;
	private String email;
	private String slogin;
	private String spass;
	
	public Staff(int sid, String staffname, String post, String phone, String email, String slogin, String spass) {
		super();
		this.sid = sid;
		this.staffname = staffname;
		this.post = post;
		this.phone = phone;
		this.email = email;
		this.slogin = slogin;
		this.spass = spass;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSlogin() {
		return slogin;
	}

	public void setSlogin(String slogin) {
		this.slogin = slogin;
	}

	public String getSpass() {
		return spass;
	}

	public void setSpass(String spass) {
		this.spass = spass;
	}
	
	

}
