package io.railflow.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.railflow.zephyr.annotations.CustomField;
import io.railflow.zephyr.annotations.Railflow;

/**
 * @author Sergey Oplavin
 */
@Railflow(name = "name from class", labels = { "testOne", "testTwo" }, priority = "High", smartFailureAssignment = { "user1@company.io",
		"user2@company.io" }, caseFields = { @CustomField(name = "field 1", value = "value 1"),
				@CustomField(name = "field 2", value = "value 2") }, executionFields = { @CustomField(name = "exec field 1", value = "exec value 1"),
						@CustomField(name = "exec field 2", value = "exec value 2") }, stepFields = {
								@CustomField(name = "step field 1", value = "step value 1"), @CustomField(name = "step field 2", value = "step value 2") })
public class LoginFormTest {

	@Test
	public void login_correct_credentials() {
		Utils.runTest();
	}

	@Railflow(name = "name from method", labels = { "testThree", "testFour" }, priority = "Low", smartFailureAssignment = "user3@company.io", caseFields = {
			@CustomField(name = "method field 1", value = "method value 1"),
			@CustomField(name = "method field 2", value = "method value 2") }, executionFields = {
					@CustomField(name = "method exec field 1", value = "method exec value 1"),
					@CustomField(name = "method exec field 2", value = "method exec value 2") }, stepFields = {
							@CustomField(name = "method step field 1", value = "method step value 1"),
							@CustomField(name = "method step field 2", value = "method step value 2") })
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