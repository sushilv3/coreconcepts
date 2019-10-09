package immutability;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		ImmutablePerson ip = new ImmutablePerson(9, "Aman", new Address("Barabaki", "up"));
		System.out.println("ImmutablePerson : " + ip);
		ip.getAddress().setCity("Barabakiiiiiiiiii");

		System.out.println("======================");

		List<ImmutablePerson> imp = ip.people();

		System.out.println("list of immutablePerson : " + imp);

		System.out.println("======= found element an index 1 Before Change ======");
		ImmutablePerson foundimp = imp.get(1);
		System.out.println("found obj : " + foundimp);

		System.out.println("======= found element an index 1 after Change ======");
		foundimp.getAddress().setCity("ALDDDDDD");

		System.out.println("found obj : " + foundimp);
		
		System.out.println("list of immutablePerson : " + imp);
		
		ip.getAddress().setCity("QQQQQQQQQQQQQQQQQQQQQQQQ");
		System.out.println("ImmutablePerson : " + ip);

	}
}
