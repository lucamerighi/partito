
public class Main {
	public static void main(String[] args) {
		Partito[] partiti = new Partito[] {new Partito("PD", 20), new Partito("M5S", 40), new Partito("Lega", 40)};
		Elezioni el = new Elezioni(partiti);
		System.out.println(el);
	}
}
