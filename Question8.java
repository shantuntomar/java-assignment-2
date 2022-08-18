public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ine@ur#on%";
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') continue;
			if(ch >= 'a' && ch <= 'z') continue;
			if(ch >= '0' && ch <= '9') continue;
			else count++;
		}
		System.out.println("Special character are : " + count);

	}

}
