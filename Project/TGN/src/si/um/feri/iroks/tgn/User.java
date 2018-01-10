package si.um.feri.iroks.tgn;

import java.sql.Blob;

public class User {
	private int userID;
	private String first_name, last_name, email, pass;
	private Blob photo;
	
	
	
	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public User(){
		
	}
	
	public User(int userID, String first_name, String last_name, String email, String pass, Blob photo){
		super();
		this.userID=userID;
		this.first_name=first_name;
		this.last_name=last_name;
		this.email=email;
		this.pass=pass;
		this.photo = photo;
	}
	
	public User(int userID, String first_name, String last_name, String email, String pass){
		super();
		this.userID=userID;
		this.first_name=first_name;
		this.last_name=last_name;
		this.email=email;
		this.pass=pass;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
