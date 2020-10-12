package Lesson22;

public class Chelovek {
    final String pol;
    private String name;
    private int age;
    private int ves;
    boolean clever;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClever(){
        return clever;
    }
    public void setClever(boolean b){
        this.clever = b;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if (ves > 0) {
            this.ves = ves;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
//        c.name = "Petya";
//        c.age = 25;
//        c.ves = 65;

        c.setName("Petya");
        c.setVes(50);
        c.setAge(15);
        System.out.println(c.getName() + " " + c.getAge() +" "+ c.getVes());
        c.setVes(-100);
        c.setClever(true);
        System.out.println(c.getName() + " " + c.getAge() +" "+ c.getVes());
        System.out.println(c.isClever());
    }
}
