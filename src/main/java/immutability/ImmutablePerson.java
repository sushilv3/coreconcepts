package immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//class should be final and if any immutable object has in class than return copy Of object
public class ImmutablePerson {
	private final int id;
	private final String name;
	private final Address address;

	public ImmutablePerson(final int id, final String name, final Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public List<ImmutablePerson> people() {
		List<ImmutablePerson> listOfPerson = Arrays.asList(new ImmutablePerson(1, "Rakesh", new Address("lko", "UP")),
				new ImmutablePerson(2, "Sanjay", new Address("Allahabad", "UP")),
				new ImmutablePerson(3, "Alok", new Address("Kanpur", "UP")),
				new ImmutablePerson(4, "Mahesh", new Address("Sitapur", "UP")));
		List<ImmutablePerson> duplicateListOfPerson = listOfPerson;
		return duplicateListOfPerson;
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		String c = this.address.getCity();
		String s = this.address.getState();
		Address adrs = new Address(c, s);
		return adrs;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ImmutablePerson [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
