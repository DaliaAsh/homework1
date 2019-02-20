import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest1 {

	@Test
	public void test() {
		ShoppingCart sc = new ShoppingCart();
		assertTrue(0 == sc.getCount()); 
	}

}
