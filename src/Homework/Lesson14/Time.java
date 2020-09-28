package Homework.Lesson14;

public class Time {
    static void showTime() {
        HOUR:
        for (int hour = 0; hour <= 6; hour++) {
            MINUTE:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break HOUR;
                }
                SECOND:
                for (int sec = 0; sec <= 59; sec++) {
                    if ((sec * hour) > minute) {
                        continue MINUTE;
                    }
                    System.out.println(hour + ":" + minute + ":" + sec);
                }
            }
        }
    }


    public static void main(String[] args) {
        showTime();
    }

}
