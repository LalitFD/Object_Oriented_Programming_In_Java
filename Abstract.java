package OOPS_IN_JAVA;


abstract class Perosn{
    void listen(){
        System.out.println("person can easily listen ");
    }
    abstract  void walk ();
    abstract void eat();

}
class lalit extends Perosn{

    @Override
    void walk() {
        System.out.println("waik in peraon ");
    }

    @Override
    void eat() {
        System.out.println("eat in persson ");
    }
}
class  main {

    public static void main(String[] args) {
        Perosn  a= new Perosn() {
            @Override
            void walk() {
                System.out.println("waik in peraon ");
            }

            @Override
            void eat() {
                System.out.println("eat in persson ");
            }
        };
        a.listen();
        a.walk();
        a.eat();

    }
}
