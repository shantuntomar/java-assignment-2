public class Question4 {

	public static void main(String[] args) {
		// panagram string or not.
		String str = "iNeuron";
		boolean[] alphaList = new boolean[26];
		int index = 0;
		int flag = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
			}
			alphaList[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (alphaList[i] == false) flag = 0;
		}
		if (flag == 1)System.out.println("string is a pangram.");
		else System.out.println("string is not a pangram.");
	}

}
