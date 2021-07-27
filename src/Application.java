public class Application {

    public static void main(String[] args) {
        int value = 7;  //this is a value

        int[] values; //this is a reference to some integers

        values = new int[3]; //allocate an amount of memory to allocate 3 integers

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for(int i = 0; i< values.length; i++) {
            System.out.println(values[i]);
        }
        int[] numbers = {2, 45, 6, 89};

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
