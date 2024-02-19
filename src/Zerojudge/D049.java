package problems;

import java.util.Scanner;

public class D049 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int i = in.nextInt();
			System.out.println(i-1911);
		} finally {
			in.close();
		}
	}

}
