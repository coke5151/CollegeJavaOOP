package problems;

import java.util.Scanner;

public class D051 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		try {
			double f = in.nextDouble();
			double c = (f-32)*5/9;
			System.out.printf("%.3f", c);
		} finally {
			in.close();
		}
	}

}
