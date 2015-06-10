import java.util.Iterator;
import java.util.LinkedList;


public class Linky {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linky in = new Linky();
	LinkedList ll = new LinkedList();
	ll.add(1);
	ll.add(in.getClass().getDeclaredMethods());
	ll.add(5);
	ll.add(8);
	ll.add(3);
	Iterator it = ll.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}

}
