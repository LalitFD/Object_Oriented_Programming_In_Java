package OOPS_IN_JAVA;

public class Student extends person implements richman,socialworker{
    private String rollno;
    private String course;
    public int marks;

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public void earnmoney() {
        System.out.println("student earn in money in 50k in per month");
    }

    @Override
    public void party() {
        System.out.println("student have celebtare a party in mithya club ");
    }

    @Override
    public void donation() {
        System.out.println("student donate 5k for poor families ");
    }

    @Override
    public void help_to_other() {
        System.out.println("Student helps to othes by giving old books");
    }
}
