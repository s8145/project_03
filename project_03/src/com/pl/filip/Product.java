package com.pl.filip;



public class Product {

	
	public Product(){
		
	}
	public String nazwa;
	public double cena;
	public Product(String nazwa, double cena){
		this.nazwa=nazwa;
		this.cena=cena;
	}
	
	
	public void printProduct(){
		System.out.println("nazwa: "+nazwa+"\tcena: "+cena+"zl");
	}
	

}
