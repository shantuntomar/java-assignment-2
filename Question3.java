import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		// string is anagram or not.
		String s1 = "computer";
		String s2 = "puteroty";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		String s3 = new String(a);
		String s4 = new String(b);
		
		if(s3.equals(s4)) {
			System.out.println("Anagram String");
		}
		else System.out.println("Not a Anagram String");
		

	}

}
