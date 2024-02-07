package OOPS_IN_JAVA;

public class Btest {
    public static void main(String[] args) {
        Biner bi=new Biner() {
            @Override
            public void show() {
                System.out.println("this is show method using annonyomous ");
            }

            @Override
            public void display() {
                System.out.println("this is display method using annonyomous");
            }
        };
        bi.show();
        bi.display();
    }
}
