package dalia;
import static org.junit.Assert.*;

import org.junit.Test;
import source.Book;
import source.ShoppingCart;
public class MyTest1 {

	@Test
	public void test() {
		ShoppingCart sc = new ShoppingCart();
		assertTrue(0 == sc.getCount()); 
	}

}
