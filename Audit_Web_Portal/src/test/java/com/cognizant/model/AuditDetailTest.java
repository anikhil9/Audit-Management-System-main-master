package com.cognizant.model;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;


/**
 * 
 * 	Test class to test AuditDetails 
 *
 */
public class AuditDetailTest {

	private AuditDetails details;
	
	@Before
	public void setup() {
		details = new AuditDetails();
	}
	
	@Test
	public void testGetSetAuditType() {
		details.setAuditType("Internal");
		assertEquals("Internal", details.getAuditType());
	}
	
	@Test
	public void testGetSetAuditDate() {
		Date date = new Date();
		details.setAuditDate(date);
		assertEquals(date, details.getAuditDate());
	}
	
	@Test
	public void testAuditDetailsAllConstructor()
	{
		Date date = new Date();
		AuditDetails auditDetails=new AuditDetails("ab", date);
		assertEquals( "ab" , auditDetails.getAuditType());
	}
	
}
