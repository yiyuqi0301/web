package kj.beans;

public class User_stu {
	private String username ; 
	private String password ;
	private String email;
	private String name;
	private String sex;
	private String college;
	private String subject;
	private String classid;
	private String level;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "User_stu [username=" + username + ", password=" + password + ", email=" + email + ", name=" + name
				+ ", sex=" + sex + ", college=" + college + ", subject=" + subject + ", classid=" + classid + ", level="
				+ level + "]";
	}
	public User_stu(String username, String password, String email, String name, String sex, String college,
			String subject, String classid, String level) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.sex = sex;
		this.college = college;
		this.subject = subject;
		this.classid = classid;
		this.level = level;
	}
	public User_stu() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}