import java.util.*;

public class PrintList<T> {
	private ArrayList<T> list = null;
	
	public PrintList() {
		this.list = new ArrayList<T>();
	}
	
	public void add(T elem) {
		list.add(elem);
	}
	
	public void printList(boolean isOdd) {
		int size = list.size();
		if ( isOdd ) {
			for ( int i = 0; i < size; i += 2 ) {
				
			}
		}
	}

}
