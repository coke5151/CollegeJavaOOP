package EX_3_14;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    private void resetTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            resetTime();
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            resetTime();
        } else {
            this.hour = hour;
        }
    }
    
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            resetTime();
        } else {
            this.minute = minute;
        }
    }
    
    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            resetTime();
        } else {
            this.second = second;
        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
