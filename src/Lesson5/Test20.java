package Lesson5;

public class Test20 {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    double srednee (int a1, int b1,int c1){
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}

class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();
        int summatreh = t.summa(10,20,30);
        System.out.println(summatreh);

        System.out.println(t.srednee(1,2,3));
    }
}