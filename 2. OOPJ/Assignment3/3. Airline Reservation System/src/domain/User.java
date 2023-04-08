package domain;

public class User {
     private String name;
     private String email;
     private long contNo;
  
     public User() {
		this("", "", 0);
	}

   public User(String name,String email, long contNo) {
	   this.name = name;
	   this.email=email;
	   this.contNo=contNo;
   }




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContNo() {
		return contNo;
	}
	public void setContNo(long contNo) {
		this.contNo = contNo;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", contNo=" + contNo + "]";
	}
     
     
}
