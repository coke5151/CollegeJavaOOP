package problems;

import java.util.Scanner;

public class A001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.nextLine();
			System.out.println("hello, " + s);
		} finally {
			sc.close();
		}
	}
}
