package daliaTest;

import static org.junit.Assert.*;

import org.junit.Test;
import source.Book;
import source.ShoppingCart;
public class SecondTest {

	@Test
	public void test() {
		ShoppingCart sc = new ShoppingCart();
		Book book = new Book();
		book.name = "Java Book";
		book.price = 127 ;
		book.unit = 1 ;
		sc.insert(book);
		assertTrue(1== sc.getCount());
		assertTrue(127 == sc.getVal());
		
	}

}
