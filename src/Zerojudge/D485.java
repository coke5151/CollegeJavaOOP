package problems;

import java.util.Scanner;

public class D485 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		try {
			int a, b;
			a = in.nextInt();
			b = in.nextInt();
			
			a += (a%2); // a 移動到偶數
			b -= (b%2); // b 移動到偶數
			
			int ans = (b-a)/2+1;
			System.out.println(ans);
		} finally {
			in.close();
		}
	}

}
