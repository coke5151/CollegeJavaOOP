package problems;

import java.util.Scanner;

public class D050 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		try {
			int t_taiwan = in.nextInt();
			int t_usa = t_taiwan + 24;
			t_usa -= 15;
			t_usa %= 24;
			System.out.println(t_usa);
		} finally {
			in.close();
		}

	}

}
