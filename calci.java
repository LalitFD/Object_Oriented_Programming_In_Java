package OOPS_IN_JAVA;
//method overloading
public class calci {
    public  void add(){
        int a,b,c;
        a=90;
        b=80;
        c=a+b;
        System.out.println("Addition of a and b = "+c);

    }
    public  void add(int x,int y){
        int c=x+y;
        System.out.println("addition of two argument int and int "+c);
    }
    public void add(int a,float b){
        float x=a+b;
        System.out.println("Addition of two Argument int and float  "+x);
    }

    public  void add(String name ,int age, String address) {
        System.out.println("details are : "+name+" "+" "+age+" "+address);
    }

    public static void main(String[] args) {
        calci cc=new calci();
        cc.add();
        cc.add(98,98.7f);
        cc.add(99,99);
        cc.add("ramu",78,"himalyan");
    }
}
