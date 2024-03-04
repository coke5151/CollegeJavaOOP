import java.util.Scanner;

public class EX_2_28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			double r = in.nextDouble();
			System.out.printf("diameter = %f\n", 2*r);
			System.out.printf("circumference = %f\n", 2*Math.PI*r);
			System.out.printf("area = %f\n", Math.PI*r*r);	
		} finally {
			in.close();
		}
	}
}

