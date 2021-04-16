package SEjUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		JUnitTesting junit=new JUnitTesting();
		int result=junit.addNumbers(5, 10);
		assertEquals(15,result);
	}

}
