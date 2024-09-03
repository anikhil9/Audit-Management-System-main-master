package com.cognizant.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



import org.junit.Before;
import org.junit.Test;


/**
 * 
 * 	Test class to test AuthResponse 
 *
 */
public class AuthResponseTest {

	private AuthResponse auth;
	
	@Before
	public void setup() {
		auth = new AuthResponse();
	}
	/**
	 * to test getter and setter
	 */
	@Test
	public void testGetSetUid() {
		auth.setUid("UID");
		assertEquals("UID", auth.getUid());
	}
	/**
	 * to test getter and setter
	 */
	@Test
	public void testValid() {
		auth.setValid(false);
		assertFalse(auth.isValid());
	}
	
	@Test
	public void testoString() {
		String string = auth.toString();
		assertEquals(string , auth.toString());
	}
	
	@Test
	public void testAuthResponseAllConstructor()
	{
	
		AuthResponse authResponse=new AuthResponse("ab", true);
		assertEquals( "ab" , authResponse.getUid());
	}
	
}
