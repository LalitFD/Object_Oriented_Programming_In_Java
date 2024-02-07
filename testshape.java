package OOPS_IN_JAVA;

public class testshape {
    public static void main(String[] args) {
        shape ss=new shape();
        ss.setBorder_width(2);
        ss.setColor("red");

        shape s2=new shape();
        s2.setBorder_width(3);
        s2.setColor("black");

        System.out.println(ss.getBorder_width()+" "+ss.getColor()+" ");

        System.out.println(s2.getBorder_width()+" "+s2.getColor()+" ");
    }
}
