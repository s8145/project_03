package com.pl.filip;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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
	static Logger logger = Logger.getLogger(Client.class);
	
	public Product beProduct(Product p) throws Wyjatek {
		if (products.indexOf(p) != -1)
		{
		return p;
		}
		else
			PropertyConfigurator.configure("logError.properties");
			logger.error("brak produktu w bazie");
		throw new Wyjatek ("brak produktu w bazie");

		}

	
	
	public void printProducts(){
		for(Product p : this.products){
			p.printProduct();			
		
		}
	}
}
