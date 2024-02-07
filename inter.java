package OOPS_IN_JAVA;

 interface bycycle {
    void speedup();
    void applybrake();
}
interface car{
    void gear();
    void accilator();
}


class cycle implements bycycle ,car{

    @Override
    public void speedup() {
        System.out.println("the press the speed and increase th speed");
    }

    @Override
    public void applybrake() {
        System.out.println("the press the decreae and decrese th speed");
    }

    @Override
    public void gear() {
        System.out.println("the change the gear");
    }

    @Override
    public void accilator() {
        System.out.println("the press the acilator and increase a speed");
    }

    public static void main(String[] args) {
cycle cl=new cycle();
cl.accilator();
cl.gear();
cl.applybrake();
cl.speedup();

    }
}