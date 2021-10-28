package com.bridgelabz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	/**
	 * Unit test for validating first name
	 */

	UserRegistration userRegistration;
	@Before
	public void before() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Daneti");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("Daneti");
		Assert.assertEquals(false, result);
	}

	/**
	 * Unit test for validating last name
	 */
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("suresh");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("suresh");
		Assert.assertEquals(false, result);

	}
	/**
	 * Unit test for validating email address
	 */
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("abc@gmail.com.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.email("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

}
