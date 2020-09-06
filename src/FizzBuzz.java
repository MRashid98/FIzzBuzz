
public class FizzBuzz {

	public void fbGenerate(int i) {
		String ans = "";
		
		if (i % 3  == 0) {
			ans += "Fizz";
		}
		if (i % 5 == 0) {
			ans += "Buzz";
		} 
		if (ans.equals("")){
			ans = Integer.toString(i);
		}
		System.out.println(ans);
	}
}
