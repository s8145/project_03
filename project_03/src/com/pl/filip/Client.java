package com.pl.filip;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.ArrayList;
import java.util.List;


public class Client {
	public String imie, nazwisko;

	public Client(){

	}
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
	
	void addProdukt(String nazwa, double cena) throws Wyjatek {
		if(cena>999)                   //nie dodaje produktow powyzej 999zl
			throw new Wyjatek(nazwa);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("dodano produkt " + nazwa);
		products.add(new Product(nazwa, cena));
	}
	

	
	
	public void printProducts(){
		for(Product p : this.products){
			p.printProduct();			
		
		}
	}
}
