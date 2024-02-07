package OOPS_IN_JAVA;

public class person1 {
    String name;
    int age;
    String address;
    public  person1 (){
        System.out.println("this is defalut construcor ");
    }
    public person1(String n,int a){
           name=n;
           age=a;
    }
    public person1(String n,int a, String add){
        name =n;
        age=a;
        address=add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        person1 p1=new person1();
        p1.setName("rammkisan");
        p1.setAge(62);
        p1.setAddress("anna hazare 81");

        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getAddress());
        person1 p2=new person1("Anna hazare",81);
        System.out.println(p2.getName()+" "+p2.getAge());

        person1 p3=new person1("Anna hazare",81,"mehandipur balaji");
        System.out.println(p3.getName()+" "+p3.getAge()+" "+p3.getAddress());
    }
}
