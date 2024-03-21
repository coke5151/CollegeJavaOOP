public class EX_5_20 {
    public static void main(String[] args) {
        double finalPi = 4.0;
        int totalTimes = 200000;
        int currentTimes = 2;
        int denominator = 3;
        int touchTargetIndex = -1; // 如果是 -1 代表還沒找到
        double touchTargetValue = 0;
        System.out.println("現在開始計算前 200,000 位 PI 的近似值，並找出至少需多少項能精確到 3.14159：");
        System.out.println("第 1 個近似：4");
        while (currentTimes <= totalTimes) {
            if (currentTimes % 2 == 1) { // 奇數項
                finalPi += (4.0 / denominator);
                denominator += 2;
            } else { // 偶數項
                finalPi -= (4.0 / denominator);
                denominator += 2;
            }
            // 如果發現開頭是 3.14159 了就記錄下來
            if (touchTargetIndex == -1 && (int) (finalPi * Math.pow(10, 5)) == 314159) {
                touchTargetIndex = currentTimes;
                touchTargetValue = finalPi;
            }
            System.out.printf("第 %d 個近似：%.15f\n", currentTimes, finalPi);
            currentTimes++;
        }
        System.out.printf("近似值模擬完成，根據記錄，第一個開頭為 3.14159 的近似值為第 %d 個近似值；值為 %.15f\n", touchTargetIndex, touchTargetValue);
    }
}
