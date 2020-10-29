package Lesson27;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws Exception {
        // абстрактная репрезентация пути к файлу или папке
        File f = new File("test9.txt");
//        File f1 = new File("test8.txt");  // FileNotFoundException
        // Класс FileInputStream предназначен для создания потока, с помощью которого
//        можно читать информацию из источника
        FileInputStream fls = new FileInputStream(f);

        fls.read();
        // Класс FileOutputStream предназначен для создания потока, с помощью которого
        // можно писать информацию в источник
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(110);
        // Конструкторы классов FileInputStream и FileOutputStream могут выбрасывать
        // исключения FileNotFoundException

        // Методы read и write классов FileInputStream и FileOutputStream могут выбрасывать
        // исключения IOException

        // обработка исключений позволяет нам разграничивать код на код, который
        // должен выполняться при обычном протекании программы и код, который должен
        // выполняться при выбросе исключений.
    }
}
