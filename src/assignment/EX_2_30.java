import java.util.Scanner;

public class EX_2_30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			String s = in.nextLine();
			Boolean first = true;
			for(int i = 0; i < s.length(); i++) {
				if(first){
					System.out.printf("%d", Character.getNumericValue(s.charAt(i)));
					first = false;
				} else {
					System.out.printf("   %d", Character.getNumericValue(s.charAt(i)));
				}
			}
		} finally {
			in.close();
		}
	}
}