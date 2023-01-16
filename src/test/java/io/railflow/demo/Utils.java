package io.railflow.demo;

/**
 * @author Sergey Oplavin
 */
public final class Utils {

	private static final String[] ERROR_MESSAGES = { "Invalid arguments passed", "Illegal access", "Invalid operation", "Bad day for testing",
			"User session has expired", "Invalid authentication", "Network error", "Request timeout", "Your request was declined by server", "Unknown error" };

	private Utils() {
	}

	public static void runTest() {
		if (Math.random() > 0.7) {
			int idx = (int) Math.round(Math.random() * 10);
			if (idx >= ERROR_MESSAGES.length) {
				idx = ERROR_MESSAGES.length - 1;
			}
			throw new RuntimeException(ERROR_MESSAGES[idx]);
		}

	}

}