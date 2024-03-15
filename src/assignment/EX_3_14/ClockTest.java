package EX_3_14;


public class ClockTest {
    public static void main(String[] args) {
        System.out.println("創建 clock1: (23:59:59)");
        Clock clock1 = new Clock(23, 59, 59); // 正確的時間
        System.out.println("創建 clock2: (24:60:60)");        
        Clock clock2 = new Clock(24, 60, 60); // 錯誤的時間
        
        System.out.println("clock1.displayTime():");
        clock1.displayTime();
        System.out.println("clock2.displayTime():");
        clock2.displayTime();

        System.out.println("測試 setHour, setMinute, setSecond 功能…");
        clock1.setHour(3);
        clock1.setMinute(15);
        clock1.setSecond(30);
        clock2.setHour(5);
        clock2.setMinute(25);
        clock2.setSecond(50);

        clock1.displayTime();
        clock2.displayTime();

        System.out.println("setHour, setMinute, setSecond 任一出錯就會把整個時間歸零：");
        clock1.setHour(30);
        clock2.setMinute(63);

        clock1.displayTime();
        clock2.displayTime();
    }
}