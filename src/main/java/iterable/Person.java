package iterable;

import java.util.Iterator;

public class Person {

	private final String name;
	private final String address;

	public Person(final String name, final String address) {
		this.name= name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	

}
