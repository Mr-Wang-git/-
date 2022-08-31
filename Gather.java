import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gather {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(1345);
		num.add(546);
		num.add(1378945);
		num.add(15);
		int rod = (int)Math.ceil(Math.random()*num.size()-1);
		System.out.println(num.get(rod));
		
		System.out.println("------");
		num.remove(2);
		Iterator<Integer> n = num.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
	}
	

	
}
