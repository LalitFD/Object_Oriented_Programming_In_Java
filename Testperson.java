package OOPS_IN_JAVA;

import java.util.Date;

public class Testperson {
    public static void main(String[] args) {
        Date dd=new Date();
        dd.setDate(30);
        dd.setMonth(0);
        dd.setYear(97);


        person ramu=new person();
        ramu.setNname("ram charan teja");
        ramu.setAddress("mumbai");
        ramu.setDob(dd);


        System.out.println("=======================");
        System.out.println(ramu.getNname());
        System.out.println(ramu.getAddress());
        System.out.println(ramu.getDob());
    }
}
