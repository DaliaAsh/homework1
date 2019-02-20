package daliaTest;

import static org.junit.Assert.*;

import org.junit.Test;
import source.Book;
import source.ShoppingCart;
public class ThirdTest {

	@Test
	public void test() {
		ShoppingCart sc = new ShoppingCart();
		Book book1 = new Book();
		book1.name = "Java Book";
		book1.price = 127 ; 
		book1.unit = 1 ; 
		Book book2 = new Book();
		book2.name = "Web Design Book";
		book2.price = 100 ; 
		book2.unit = 1 ; 
		sc.insert(book1);
		sc.insert(book2);
		assertTrue(2 == sc.getCount());
		assertTrue(227 == sc.getVal());
		
	}

}
