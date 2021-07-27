/*https://www.w3resource.com/java-exercises/method/index.php
1. Write a Java method to find the smallest number among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
 */

import java.util.Arrays;

public class Smallest {

    int first;
    int second;
    int third;

    Smallest(int a, int b, int c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public void calculateTheSmaller() {
        int[] toOrder = {this.first, this.second, this.third};
        Arrays.sort(toOrder);
        System.out.println("The smallest value is " + toOrder[0]);
    }

    public static void main(String[] args) {
        Smallest smallest = new Smallest(35, 2, 456);
        smallest.calculateTheSmaller();
    }
}
