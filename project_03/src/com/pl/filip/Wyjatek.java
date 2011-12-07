package com.pl.filip;

public class Wyjatek extends Exception {
	/**
	 * 
	 */

	private String wyjatkowa;
	
	Wyjatek (String cena){
		wyjatkowa = cena;
	}
	  public String toString() {
			return "nie dodano: " + wyjatkowa;
		    }
	}
