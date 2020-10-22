package Lesson24;

public class Test2 {
    public static void main(String[] args) {
//        Figura f = new Figura() {} в абстрактном классе нельзя создать объект
    }
}

abstract class Figura {
    int colvostoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Это фигура");
    }

}

class Kvadrat extends Figura {
    int colvostoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Периметр квадрата равен " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("Площадь квадрата равна " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int colvostoron = 4;
    int storona1 = 10;
    int storona2 = 20;

    public void perimetr() {
        System.out.println("Периметр прямоугольника равен " + 2 * storona1 + 2 * storona2);
    }

    public void ploshad() {
        System.out.println("Площадь прямоугольника равна " + storona1 * storona2);
    }
}

class Okruznost extends Figura {
    int colvostoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Периметр окружности равен " + 2 * 3.14 * radius);
    }

    public void ploshad() {
        System.out.println("Площадь окружности равна " + (3.14 * radius * radius));
    }
}

abstract class Chetyrehugolnik extends Figura {
    void def (){
        System.out.println("Это четырехугольник");
    }
}