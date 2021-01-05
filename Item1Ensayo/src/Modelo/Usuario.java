package Modelo;

public class Usuario {
	
	private String user;
	private String pass;
	
	public Usuario(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public Usuario() {
		super();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Usuario [user=" + user + ", pass=" + pass + "]";
	}
	
	

}
