package Inheritance;

public class Machine {

    private String name = "Machine Type 1"; //cant be accessible from its child class (from Car)
    String model = "Model 1";

    public void start() {
        System.out.println("Machine started");
    }

    public void stop(){
        System.out.println("Machine stopped");
    }
}
