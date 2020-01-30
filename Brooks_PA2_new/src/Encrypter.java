import java.util.Scanner;
public class Encrypter {

	public static String encrypt(String str) {
		int a[] = new int[4];
		for(int i = 0; i < 4; i++) {
			char ch = number.charAt(i);
			a[i] = Character.getNumericValue(ch);
			
		}
		
		for(int i = 0; i < 4; i++) {
			int t = a[i];
			t += 7;
			t = t % 10;
			a[i] = t;
			
		}
		
		int t = a[0];
		a[0] = a[2];
		a[2] = t;
		t = a[1];
		a[1] = a[3];
		a[3] = t;
		
		int rep = 0;
		for(int i = 0; i < 4; i++) {
		
			rep = rep * 10 + a[i];
			
		String output = Integer.toString(rep);
		if(a[0] == 0) {
			char ch = number.charAt(i);
			a[i] = Character.getNumericValue(ch);
		}

	}

}
}
