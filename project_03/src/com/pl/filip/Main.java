package com.pl.filip;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;


public class Main {


	
	public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
		PropertyConfigurator.configure("log4j.properties");

		Client cl = new Client("Pawel", "Nowak", products);
		
			
		try{
			cl.addProdukt("pilot tv - uniwersalny", 49.89);   //DODAWANIE		
		}
		catch (Wyjatek w){
			System.out.println("Obs³uga wyjatku: " + w);
		}
		
		try{
			cl.addProdukt("plyta cd", 0.99);   //DODAWANIE				
		}
		catch (Wyjatek w){
			System.out.println("Obs³uga wyjatku: " + w);
		}
		
		try{			
			cl.addProdukt("plyta dvd", 0.99);   //DODAWANIE
		}
		catch (Wyjatek w){
			System.out.println("Obs³uga wyjatku: " + w);
		}

		try{
			cl.addProdukt("slon", 10000);   //DODAWANIE		
		}
		catch (Wyjatek w){
			System.out.println("Obs³uga wyjatku: " + w);
		}
		
		try{
			cl.addProdukt("kabel USB 2.0 - 2m", 16.49);   //DODAWANIE				
		}
		catch (Wyjatek w){
			System.out.println("Obs³uga wyjatku: " + w);
		}
		
		System.out.println("-----po dodaniu produktow-----");
		cl.printProducts();	
		System.out.println("-----po usunieciu indeksu 0-----");
		products.remove(0);//USUWANIE
		cl.printProducts();	
		System.out.println("-----po aktualizacji indeksu 1-----");
		products.set(1, new Product("dyskietka", 1.99));  //UPDATE
		cl.printProducts();	
		System.out.println("-----adres produktu o indeksie 1-----");
		System.out.println(products.get(1));    //WYSZUKIWANIE
	
		
	}

}
