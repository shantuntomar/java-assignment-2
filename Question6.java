public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ineuron";
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i] > ch[j]) {
					char tmp = ch[i];
					ch[i] = ch[j];
					ch[j] = tmp;
				}
			}
		}
		String s1 = new String(ch);
		System.out.print(s1);
	}

}
