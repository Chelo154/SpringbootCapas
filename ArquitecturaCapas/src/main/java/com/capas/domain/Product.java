package com.capas.domain;

public class Product {
	
	private int id;
	private String name;
	private double amount;
	Tipo tipo;
	
	
	public Product(int id, String name, double amount,String tipo) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.tipo = guessTipo(tipo);
		
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getAmount() {
		return amount;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public String getTypeName() {
		return tipo.getTipo();
	}
	
	
	private Tipo guessTipo(String tipo) {
		if(tipo.equals("Bebida")) {
			return Tipo.Bebida;
		}
		else return Tipo.Comestible;
	}
	
	
	
	

}
