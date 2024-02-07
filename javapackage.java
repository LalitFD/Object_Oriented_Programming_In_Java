package OOPS_IN_JAVA;

import java.util.StringTokenizer;

public class javapackage {
    public static void main(String[] args) {
        System.out.println("max value ="+Math.max(567,874));
        System.out.println("Min value ="+Math.min(67,89));
        System.out.println(Math.abs(-5.76965665));
        System.out.println("Random 0-1 :"+Math.random());
        System.out.println("Square"+Math.sqrt(4));
        System.out.println("Round up="+Math.ceil(26.555));

        class testtoken{
            public static void main(String[] args) {
                String text="java is object oriented programing language";
                StringTokenizer stn=new StringTokenizer(text,",");
                while (stn.hasMoreTokens()){
                    System.out.println(stn.nextToken() );
                }
            }
        }
    }
}
