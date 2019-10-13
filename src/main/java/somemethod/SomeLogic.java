package somemethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomeLogic {
	private static int pageNo = 1;
	private int size = 2;

	public SomeLogic() {

	}

	private final void crt(int start, int size) {
		pageNo += 1;
	}

	/*
	 * private final int nxt() { return 0; }
	 */

	private final void pre() {
		pageNo -= 1;
	
	}

	 List<String> names(int pageNo, int size) {
		 int start = (pageNo - 1) *size;
		 int upto = start + size;
		List<String> names = new ArrayList<String>(
				Arrays.asList("ramesh", "mahesh", "suresh", "raju", "atul", "manish", "rakesh", "aman"));
		return names.subList(start, upto);
	}

	@Override
	public String toString() {
		return "SomeLogic [size=" + size + "]";
	}
	 
}
