public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "iNeuron";
		str = str.toLowerCase();
		for(int i=0; i<str.length()-1; i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.print(str.charAt(i) + " ");
				}
			}
		}

	}

}
