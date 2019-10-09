package serialization;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String name;
	private final int id;
	public Person(final int id, final String name) {
		this.id = id;
		this.name = name;
	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", id=" + id + "]";
//	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
