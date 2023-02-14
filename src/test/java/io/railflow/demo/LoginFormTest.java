package io.railflow.demo;

import io.railflow.zephyr.annotations.CustomField;
import io.railflow.zephyr.annotations.Railflow;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author Sergey Oplavin
 */
@Railflow(name = "Railflow on the class level", labels = { "testOne", "testTwo" }, priority = "High", smartFailureAssignment = {
		"user01@yourcompany.com",
		"user02@yourcompany.com" }, caseFields = { @CustomField(name = "Text field", value = "Value from the class"),
		@CustomField(name = "Multiline field", value = "class value") },
		executionFields = {
				@CustomField(name = "exec field", value = "zephyr.bool(true)"),
				@CustomField(name = "Date", value = "2023-01-15") },
		stepFields = {
				@CustomField(name = "Step Count", value = "zephyr.int(3)"), @CustomField(name = "Succeeded", value = "zephyr.bool(true)") })
public class LoginFormTest {

	@Test
	public void login_correct_credentials() {
		Utils.runTest();
	}

	@Railflow(name = "Railflow on the method", labels = { "testThree", "testFour" }, priority = "Low",
			caseFields = { @CustomField(name = "Text field", value = "Value from the report - method"),
					@CustomField(name = "Multiline field", value = "method value") },
			executionFields = { @CustomField(name = "exec field", value = "zephyr.bool(true)"), @CustomField(name = "Date", value = "2023-02-15") },
			stepFields = { @CustomField(name = "Step Count", value = "zephyr.int(4)"), @CustomField(name = "Succeeded", value = "zephyr.bool(true)") })
	@Test
	public void login_error_incorrect_username() {
		Utils.runTest();
	}

	@Test
	public void login_error_incorrect_password() {
		Utils.runTest();
	}

	@Railflow(zephyrKeys = { "ZT-1", "ZT-2", "ZT-3" })
	@Test
	public void login_rememberMe_is_checked() {
		Utils.runTest();
	}

	@Disabled("ignore test")
	@Test
	public void login_failed_service_unavailable() {
		Utils.runTest();
	}

}