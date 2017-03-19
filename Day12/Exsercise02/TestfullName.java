package fullName;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestfullName {

	@Test
	public void test() {
		//Test with a single space String
		fullName TestName = new fullName("Sarah Joanne Milton");
		String expected = "SJM";
		String output = TestName.getInitials(TestName.fullName);
		assertEquals(output, expected);
		
		// Test with a double space String
		fullName TestName2 = new fullName("Jarvis  Cocker");
		String expected2 = "JC";
		String output2 = TestName2.getInitials(TestName2.fullName);
		assertEquals(output2, expected2);
	}

}
