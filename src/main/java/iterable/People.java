package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
	private List<Person> peo = null;

	public People() {
		peo = new ArrayList<>();
		peo.add(new Person("rakesh", "delhi"));
		peo.add(new Person("suresh", "delhi"));
		peo.add(new Person("manoj", "pune"));
		peo.add(new Person("alok", "lkko"));
		
	}
	@Override
	public Iterator<Person> iterator() {
		// TODO Auto-generated method stub
		return peo.iterator();
	}
	@Override
	public String toString() {
		return "People [people=" + peo + "]";
	}

}
