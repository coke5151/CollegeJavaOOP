package anytime;

import java.util.Scanner;

public class JP04 {
    public static void main (String[] args){
            Scanner s = new Scanner(System.in);
            int year = s.nextInt();
            int m = s.nextInt();
            switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println(m + "月有31天");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(m + "月有30天");
            case 2:
                if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0){
                    System.out.println(year + "年" + m + "月有29天");
                }else {
                    System.out.println(year + "年" + m + "月有28天");
                }
                break;
        default:
                System.out.println("輸入月份不合法");
                break;
            }
        }
}