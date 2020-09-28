package Lesson14;

public class Test6 {
    public static void main(String[] args) {
        OUTER:
        for (int i = 0; i <= 23; i++) {
//            System.out.println("Nacjalo outer loopa");
            INNER:
            for (int j = 0; j <= 59; j++) {
                if (j == 20) {
                    continue OUTER;
                }
                if (j < 10) {
                    System.out.println(i + ":0" + j);
                } else {
                    System.out.println(i + ":" + j);
                }
                if (j == 30) {
                    break INNER;
                }
            }
//            System.out.println("Konec outer loopa");
        }
    }
}
