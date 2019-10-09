package iterable;

import java.util.Iterator;

public class PeopleTest {

	public static void main(String[] args) {

		People peo = new People();

		for (Person per : peo) {
			System.out.println("Person : " + per);
		}

		Iterator<Person> person = peo.iterator();
		while (person.hasNext()) {
			System.out.println(person.next());
		}
	}
}
