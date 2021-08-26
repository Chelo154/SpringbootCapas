package com.capas.domain;

public enum Tipo {
	
	Bebida("Bebida"),
	Comestible("Comestible");
	
	String tipo;
	
	Tipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}


}
