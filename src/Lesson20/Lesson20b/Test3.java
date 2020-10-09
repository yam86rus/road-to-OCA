package Lesson20.Lesson20b;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777,"Ivanov Michail");
        map.put(778,"Trigulov Zaur");
        map.put(776,"Trigulov Zaur");
        map.put(779,"Gubanov Pavel");
        map.put(780,"Petrov Petr");
        map.put(779,"Roberto Carlos"); // будет перезаписано. Дубликаты не поддерживаются с точки зрения key
        System.out.println(map);

        map.remove(779); // удаляем по key
        System.out.println(map);
    }
}
