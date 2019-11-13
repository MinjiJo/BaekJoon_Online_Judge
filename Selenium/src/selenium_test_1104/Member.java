package selenium_test_1104;

public class Member {
	String id;
	String pass;
	String jumin1;
	String jumin2;
	String email;
	String domain;
	String hobby;
	String post;
	String address;
	String content;
	Member(String id, String pass, String jumin1, String jumin2, String email, String domain, String hobby, String post, String address, String content){
		this.id=id;
		this.pass=pass;
		this.jumin1=jumin1;
		this.jumin2=jumin2;
		this.email=email;
		this.domain=domain;
		this.hobby=hobby;
		this.post=post;
		this.address=address;
		this.content=content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getJumin1() {
		return jumin1;
	}
	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}
	public String getJumin2() {
		return jumin2;
	}
	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby=hobby;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post=post;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	};
	
}
