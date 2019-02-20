import java.util.ArrayList;

public class ShoppingCart {
ArrayList books = new ArrayList();
int val ; 
	public int getCount() {
		// TODO Auto-generated method stub
		return books.size();
	}

	public void insert(Book book) {
		// TODO Auto-generated method stub
	books.add(book);
	val += book.price;
	}

	public int getVal() {
		// TODO Auto-generated method stub
		return  val;
	}

}
