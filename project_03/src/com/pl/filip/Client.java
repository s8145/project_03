package com.pl.filip;

import java.util.ArrayList;
import java.util.List;


public class Client {
	public String imie, nazwisko;

	public Client(String imie, String nazwisko){
		this.imie=imie;
		this.nazwisko=nazwisko;
	}
	
	public Client(String imie, String nazwisko, List<Product> products){
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.products=products;
	}
	
	public List<Product> products = new ArrayList<Product>();

	
	public void printProducts(){
		for(Product p : this.products){
			p.printProduct();			
		}
	}

	

}
