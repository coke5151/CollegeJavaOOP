import java.util.Scanner;

public class A002 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		try {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a+b);
		} finally {
			in.close();
		}
	}

}
