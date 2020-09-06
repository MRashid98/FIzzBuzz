
public class app {

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		
		for (int i = 1; i <= 100; i++) {
			fb.fbGenerate(i);
		}
	}
}
