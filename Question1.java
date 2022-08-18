public class Question1 {

	public static void main(String[] args) {
		String str = "iNeuron";
		String res = "";
		for(int i=str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			char c = ch; 
			res+=ch;
		}
		System.out.print(res);
		

	}

}
