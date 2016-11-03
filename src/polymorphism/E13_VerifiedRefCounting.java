package polymorphism;
import static com.oubl23.util.Print.*;
class Shared {
	private int refcount = 0;
	private static int counter = 0;
	private int id = counter++;
	public Shared() {
		print("Creating " + this);
	}
	public void addRef() { refcount++; }
	protected void dispose() {
		if(--refcount == 0)
			print("Disposing " + this);
	}
	protected void finalize() {
		if(refcount != 0)
			print("Error: object is not properly cleaned-up!");
	}
	public String toString() { return "Shared " + id; }
}
class Composing {
	private Shared shared;
	private static int counter = 0;
	private int id = counter++;
	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		print("disposing " + this);
		shared.dispose();
	}
	public String toString() { return "Composing " + id; }
}
public class E13_VerifiedRefCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for(Composing c : composing)
			c.dispose();
// Verify failure:
		System.gc();
		new Composing(new Shared());
		System.gc();
	}
}
