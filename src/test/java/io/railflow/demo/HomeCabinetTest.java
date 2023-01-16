package io.railflow.demo;

import org.junit.jupiter.api.Test;

/**
 * @author Sergey Oplavin
 */
public class HomeCabinetTest {

	@Test
	public void change_password() {
		Utils.runTest();
	}

	@Test
	public void change_password_fail_on_incorrect_confirmation() {
		Utils.runTest();
	}

	@Test
	public void change_password_fail_on_incorrect_password() {
		Utils.runTest();
	}

	@Test
	public void change_email() {
		Utils.runTest();
	}

	@Test
	public void change_email_fail_on_invalid_email() {
		Utils.runTest();
	}
}
