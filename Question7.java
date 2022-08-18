public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "iNeuron";
		str = str.toLowerCase();
		int countVowel = 0 , countConsonant = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) continue;
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				countVowel++;
			}
			else countConsonant++;
		}
		System.out.print("vowels :" + countVowel + " " + "consonant :" + countConsonant);

	}

}
