package OOPS_IN_JAVA;

public class cTest {
    public static void main(String[] args) {
        ciner ci=new ciner() {
            @Override
            public void wish() {
                System.out.println("wish using annonoums ");
            }
        };
        System.out.println("===============================");

        //lambda expression
        ciner ss=()->{
            
        };
    }
}
