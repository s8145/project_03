package com.pl.filip;

import org.apache.log4j.Logger;
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
	private static Logger logger = Logger(Client.class);
	
	public Product beProduct(Product p) throws Wyjatek {
		if (products.indexOf(p) != -1)
		{
		return p;
		}
		else
		throw new Wyjatek ("brak produktu w bazie");
		logger.info("brak produktu w bazie");
		}

	
	
	public void printProducts(){
		for(Product p : this.products){
			p.printProduct();			
		
		}
	}
}
