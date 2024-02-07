package OOPS_IN_JAVA;

public class Argu_length {
    public void add(int... xy) {
        int sum = 0;
        for (int a : xy) {
            sum = sum + a;
        }
        System.out.println("sum = " + sum);
    }

    public void show(String... nar) {
        for (String n : nar) {
            System.out.println("Hello" + n);
        }
        System.out.println("Bye...");
    }

    public static void main(String[] args) {
        calci cc = new calci();
        cc.add();
//        cc.add(89.99);
//        cc.add(11,22,33,44);


    }
}
