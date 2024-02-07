package OOPS_IN_JAVA;

public class perso {
    private String name;
    private  String address;
    private  int age;
    private  String mobile;

    perso(){
        System.out.println("default constructor");
    }
    perso(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("2 param constructor");
    }
    perso(String name,int age ,String Address,String mobile){
        this.name=name;
        this.age=age;
        this.address=address;
        this.mobile=mobile;
        System.out.println("4 param constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
