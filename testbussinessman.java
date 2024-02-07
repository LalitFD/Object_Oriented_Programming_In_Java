package OOPS_IN_JAVA;

public class testbussinessman {
    public static void main(String[] args) {
        richman rm=new Student();
        rm.party();
        rm.donation();
        rm.earnmoney();

        socialworker sw=new Student();
        sw.help_to_other();
        System.out.println("=================================");

        richman rb=new Bussinesman();
        rb.earnmoney();
        rb.party();
        rb.donation();
        System.out.println("=================================");

        Student st=new Student();
        st.setNname("kuldeep");
        st.setCourse("java");
        st.setMarks(245);

        st.setRollno("02cs2643");
        st.setAddress("mumbai");
        System.out.println("Student detail ");
        System.out.println(st.getNname()+" "+st.getCourse()+" "+st.getMarks()+" "+st.getRollno()+" "+st.getAddress());

        st.earnmoney();
        st.party();
        st.donation();
        st.help_to_other();
        System.out.println("=====================================");

        Driver dd=new Driver();
        dd.setNname("rajesh");
        dd.setAddress("naryawali");
        dd.setDrive("truck");

        System.out.println("driver details ");
        System.out.println(dd.getNname()+" "+dd.getAddress()+" "+dd.getDrive());
        dd.help_to_other();
    }
}
