package OOPS_IN_JAVA;

public class Driver extends person implements socialworker {
    private  String drive;

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public void help_to_other() {
        System.out.println("driver heips in other by free services ");
    }
}
