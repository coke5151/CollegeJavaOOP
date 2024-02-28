import java.util.Scanner;

public class D489 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		try {
			int a1, a2, a3;
			double s;
			a1 = in.nextInt();
			a2 = in.nextInt();
			a3 = in.nextInt();
			s = (double)(a1+a2+a3)/2;
			System.out.println((int)(s*(s-a1)*(s-a2)*(s-a3)));
		} finally {
			in.close();
		}
	}

}
