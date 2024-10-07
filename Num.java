import java.util.Stack;
import java.util.Scanner;
/** @param Num class accepts values for a Stack */
/** This class originally took user's integer input to create a Linked List, However it's been edited to create a STACKED list now.  */


public class Num {
    private Stack<Integer> numbers;
    /** create private Stacked list named 'numbers' */
    public Num(){
        numbers = new Stack<>();
        /** create Stacked List named 'numbers' */
    }
    public void addNumbers(int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.println("Enter a number: ");
            int x = sc.nextInt();
            numbers.push(x);
            /** for loop to keep accepting values */
        }
    System.out.println("You've submitted the following Stack: " + numbers);
    }

    /** display unsorted stacked list */

    public Stack<Integer> getNumbers(){
        return numbers;
        /** deliver the class to other classes */



    }
}
