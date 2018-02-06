package com.basico;

public class Productos {
	
	private String mail;
	private String prod;
	private int uni;
	private double precio;
	
	public Productos () {};
	
	public Productos(String mail, String prod, int uni) {
		this.mail = mail;
		this.prod = prod;
		this.uni = uni;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getProd() {
		if(prod.equals("Camiseta")) {
			precio = 10*uni*1.21;
			System.out.println("Camiseta = " + precio);
		}else if(prod.equals("Pantalon")) {
			precio = 15*uni*1.21;
		}else if(prod.equals("Pantalon")) {
			precio = 15*uni*1.21;
		}
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public int getUni() {
		return uni;
	}

	public void setUni(int uni) {
		this.uni = uni;
	};
	
	
	
	
	

}
