package io.railflow.demo;

import java.util.Arrays;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import io.railflow.zephyr.annotations.junit.CurrentTest;

/**
 * @author Sergey Oplavin
 */
public class PaymentsTest {

	@Test
	public void user_has_valid_cc() {
		CurrentTest.setName("User had valid CC");
		CurrentTest.setLabels(Arrays.asList("CC"));
		System.out.println("Checking if the user has valid CC");
		Utils.runTest();
	}

	@Test
	public void user_has_invalid_cc() {
		Utils.runTest();
	}

	@Test
	public void an_error_occurred_during_transaction() {
		Utils.runTest();
	}

	@Test
	public void user_cancels_transaction() {
		Utils.runTest();
	}

	@Test
	public void notification_message_is_correct() {
		Utils.runTest();
	}

	@Nested
	public class MyNestedTests {
		@Test
		public void nested_test_one() {
		}

		@Test
		public void nested_test_two() {
		}

		@Nested
		public class NestedNestedTests {
			@Test
			public void nested_nested_test_one() {
			}
		}
	}
}