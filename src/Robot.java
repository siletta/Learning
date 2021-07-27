public class Robot {

    private String name;
    private int age;

    public void talk() {
        System.out.println("Hello");
    }

    public void talk (String name) {
        System.out.println("My name is " + name);
    }

    Robot (String name, int age) {
        this.name = name;
        this.age = age;
    }


    Robot() {
        this("pippo", 34);
        System.out.println("Second constructor called after first one");
    }

    public static void main(String[] argv) {
        Robot sam = new Robot();
        sam.talk();
        sam.talk("John");
    }


}
