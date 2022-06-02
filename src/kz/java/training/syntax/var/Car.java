package kz.java.training.syntax.var;

public class Car {
    private int i=10;
    private int x, y, z;
    private int a=5; b=4; c=10;
    private String name;

    public Car(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public void test(){
        i=4;

    }

    private void go(){
        private int count = 0;
        count++;
        System.out.println(i);

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
