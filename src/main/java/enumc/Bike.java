package enumc;

import enumc.Colors;

public class Bike {
	private final String name;
	private final Colors color;
//	private final Color1 color;
	
	
//	private final Enginepower cc;
	private final int cc;
	public Bike(final String name, final Colors c, final int e) {
		this.name = name;
		this.color = c;
		this.cc = e;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", color=" + color + ", cc=" + cc + "]";
	}
}
