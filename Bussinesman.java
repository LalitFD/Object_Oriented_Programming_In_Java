package OOPS_IN_JAVA;

public class Bussinesman extends person implements richman {
    private String bussiness;

    public String getBussiness() {
        return bussiness;
    }

    public void setBussiness(String bussiness) {
        this.bussiness = bussiness;
    }

    @Override
    public void earnmoney() {
        System.out.println("bussinessman earn money in 50000k");
    }

    @Override
    public void party() {
        System.out.println("bussinessman is party in redissioon blue ");

    }

    @Override
    public void donation() {
        System.out.println("businessman donate 500crore in cheritable");
    }
}
