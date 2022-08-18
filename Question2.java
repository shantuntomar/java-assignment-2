public class Question2 {

	public static void main(String[] args) {
		String str = "Think Twice";
		String[] s = str.split(" ");
		String[] res = new String[s.length];
		for(int i=0; i<s.length; i++) {
			res[i] = reverse(s[i]);
		}
		for(String ele : res) {
			System.out.print(ele + " ");
		}
	}
	public static String reverse(String str) { // think
		char[] ar = str.toCharArray();
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			rev+=ch;
		}		
		return rev;
	}

}
