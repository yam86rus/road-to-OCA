package Lesson27;
import java.io.*;
public class Test4 {
    public static void main(String[] args) {
        File f = new File("test9.txt"); // создание абстрактного пути к файлу

        int[] array = {4, 8, 1};
        System.out.println("У нас есть массив");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println(array[10]);
            System.out.println("Хорошего дня");
        }

        catch (FileNotFoundException e) {
            System.out.println("Был пойман Exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Был пойман второй Exception: " + e);
        }
        // несколько catch блоков могут следовать друг за другом, но лишь 1 finally блок
        // может следовать за catch блоками
        // последовательность блоков всегда должна соответствовать следующему порядку
        // try -> catch -> finally


        finally {
            // все что будет написано в finally будет всегда обрабатываться
            System.out.println("Это finally block");
        }
    }
}
