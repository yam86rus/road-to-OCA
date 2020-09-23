package SandBox;

public class Loop {

    public static void grow(int a) {
        for (int i = 0; i <= a - 1; i++) {
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void decline(int a) {
        for (int i = a - 1; i >= 0; i--) {
            for (int l = 0; l <= i; l++) {
                System.out.print(".!.");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            grow(7);
            decline(7);
        }

    }
}
