package mvn;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void testGreetingMessage() {
		assertEquals("Hello John! Welcome to Java Programming", Hello.getGreetingMessage("John"));
	}

}
