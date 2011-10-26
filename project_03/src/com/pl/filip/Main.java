package com.pl.filip;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**f
	 * @param args
	 */
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();


		Client cl = new Client("Pawel", "Nowak", products);

		products.add(new Product("plyta dvd-rw", 2.99));   //DODAWANIE
		products.add(new Product("plyta dvd", 1.99));
		products.add(new Product("plyta cd", 0.99));	
		
		products.remove(0);                          //USUWANIE
		
		products.set(1, new Product("dyskietka", 1.99));  //UPDATE
	
		cl.printProducts();
		System.out.println("rozmiar:" +products.size());
		
		System.out.println(products.get(1));    //WYSZUKIWANIE
	}

}
