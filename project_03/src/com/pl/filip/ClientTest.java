package com.pl.filip;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClientTest {

	public void testAddProdukt() throws Wyjatek {
		Client cl = new Client();
		cl.addProdukt("tester", 99.66);
	}

}
