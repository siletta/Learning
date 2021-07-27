public class Thing {
    public String name;
    public static String description = "some desc";

    //public static final String some; //error: has to be initialized as it is FINAL

    public static final String aName = "Angela";

    public static int count = 0; // this will increment each time the class is instanciated (as it is STATIC)

    public Thing() {
        count ++;
    }

    public void ShowName() {
        System.out.println(name);
        System.out.println(description); //WORKS non static method can access to static data
    }

    public static void showInfo() {
        System.out.println(description);
       //System.out.println(name) --> DONT WORK - Static method can't access to NON static data
    }

    public static void main (String[] args) {

        System.out.println("Before creating objects count is: " + Thing.count);

        Thing thing1 = new Thing();
        System.out.println("After creating objects count is: " + Thing.count);
        Thing thing2 = new Thing();
        System.out.println("After creating objects count is: " + Thing.count);
        thing1.name = "Bob";
        thing2.name = "Pippo";

        thing1.ShowName();
        thing2.ShowName();


    }
}