package OOPS_IN_JAVA;

public class STUDENTCLASS {
    public static  class student{
        String name;
        int  rno;
        double perc;
    }

    public static void main(String[] args) {

        student s=new student();
        s.name="lalit doriya";
        s.rno=829;
        s.perc=76.9;

        System.out.println(s.name+" "+s.rno+" "+s.perc);
    }
}
