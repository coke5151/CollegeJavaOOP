import java.util.Scanner;

public class EX_2_30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			String s = in.nextLine(); // 將輸入的數字以字串儲存
			// 若輸入的數字的位數不是 5 位，但數字的「長度」仍在 int 能存的範圍內
			// eg. 123454321 的長度為 9 位
			// 則答案皆會正常。
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