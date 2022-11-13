package erdems.jacoco.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeProcesserTest {

	@Test
	public void test() {
	    PalindromeProcesser palindromeTester = new PalindromeProcesser();
	    assertTrue(palindromeTester.isPalindrome(""));
	}

}
