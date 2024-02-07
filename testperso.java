package OOPS_IN_JAVA;

public class testperso {
    public static void main(String[] args) {
        perso pp=new perso();
        pp.setName("manpreet");
        pp.setAddress("gujrat");
        pp.setAge(55);
        pp.setMobile("+91 9009451242");

        System.out.println(pp.getName()+" "+pp.getAddress()+" "+pp.getAge()+" "+pp.getMobile());

        perso p2=new perso("honey singh",25);
        p2.setAddress("mumbai");
        p2.setMobile("+91 85462579653");
        System.out.println(p2.getName()+" "+p2.getAddress()+" "+p2.getAge()+" "+p2.getMobile());


        perso p3=new perso("palak" ,25,"near medanta ","+91 8564564686");
        System.out.println(p3.getName()+" "+p3.getAddress()+" "+p3.getAddress()+" "+p3.getMobile() );

}
}
