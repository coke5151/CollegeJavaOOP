package practice;

import java.util.Scanner;

public class EX_2_30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			String s = in.nextLine();
			for(int i = 0; i < s.length(); i++) {
				System.out.printf("%d   ", Character.getNumericValue(s.charAt(i)));
			}
		} finally {
			in.close();
		}
	}
}