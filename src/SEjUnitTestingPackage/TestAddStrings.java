package SEjUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		JUnitTesting j=new JUnitTesting();
		String res=j.addStrings("se", "lab");
		assertEquals("selab",res);
	}

}