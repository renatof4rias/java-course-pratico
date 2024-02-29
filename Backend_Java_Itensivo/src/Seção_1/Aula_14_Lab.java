package Seção_1;

public class Aula_14_Lab {
	
	
	public String a;  
	private String b;
	protected String c;
	String d; // <- DEFAULT/PACKAGE 
	
	
	public Aula_14_Lab(String b) {
		setB(b);
	}
	
	private void setB(String b) {
		this.b = b;
	}
	
	public String getB() {
		return b;
	}
	
}
