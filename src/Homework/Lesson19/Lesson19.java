package Homework.Lesson19;
/* Создайте метод abc, инпут параметров - N-ое количество массивов типа String. В методе создайте
новый массив, который будет состоять из элементов массивов - параметров и будет аутпутом данного
метода. В методе main вызовети метод abc и его элементам, которын равн значениям command line параметров,
присвойте значения null. Выведите элементы обновленного массива на экран. Везде, где возможно, используйте
foreach loop. Запустите приложение с командной строки.
 */

public class Lesson19 {
    static String[] abc(String[]... array1) {
        int length = 0;
        for (String[] a : array1) {
            length += a.length;
        }
        String[] array = new String[length];

        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                array[count] = s;
                count++;
            }
        }


        return array;
    }

    public static void main(String[] args) {
        String[] str1 = {"Паша", "Ваня", "Максим"};
        String[] str2 = {"Мария", "Наташа", "Лена", "Кто-то еще"};
        String[] str3 = {"и еще кто-то", "и все"};
        String[] name = abc(str1, str2, str3);
        for (String d: name){
            System.out.print(d + " ");
        }
    }
}
