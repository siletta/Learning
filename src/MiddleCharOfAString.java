import java.util.Scanner;

/*3. Write a Java method to display the middle character of a string. Go to the editor
Note:
a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
Expected Output:


The middle character in the string: 5

 */
public class MiddleCharOfAString {

    private String inputString;

    MiddleCharOfAString(String input) {
        this.inputString = input;
    }

    public void showTheMiddleOfAString() {
        int middle = inputString.length() / 2 ;
        if ( inputString.length() % 2 == 0) {
            System.out.println(inputString.substring(middle-1, middle+1));
        } else {
            System.out.println(inputString.charAt(middle));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        MiddleCharOfAString middleOfAWord = new MiddleCharOfAString(word);
        middleOfAWord.showTheMiddleOfAString();
    }
}
