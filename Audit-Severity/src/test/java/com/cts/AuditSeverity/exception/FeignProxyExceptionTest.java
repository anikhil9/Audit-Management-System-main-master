package com.cts.AuditSeverity.exception;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;



import lombok.extern.slf4j.Slf4j;

/**
 * 
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration @Slf4j
public class FeignProxyExceptionTest {

	/**
	 * to test the FeignProxyException
	 * 
	 */
	@Mock
	Environment env;
	
	@Mock
	FeignProxyException feignProxyException;
	
	@Test
	public void testInvalidAuthorizationException() {
		
		
		
			assertNotNull(feignProxyException);
		}
		
		/*
		 * @Test public void testConstructor() {
		 * 
		 * assertNotNull(new FeignProxyException()); }
		 */
		

	}

