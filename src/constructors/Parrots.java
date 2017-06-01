package constructors;

public class Parrots {

	public static void main(String[] args) {
		Parrot myParrot = new Parrot();
		myParrot.name = "Dewd";

		Parrot anotherDewd = createParrot("Dewd");

	}

	public static Parrot createParrot(String parrotName) {
		Parrot p = new Parrot();
		p.name = parrotName;
		return p;
	}
}
