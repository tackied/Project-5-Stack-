/**
 * @author Daniel Tackie
 * @since Week 4 of CSC6301

 * @param Main class takes two classes(one that creates a Stack) and another that(sorts the Stack) and implements it into one program
 */

 import java.util.Stack;
 import java.util.Scanner;
 /** 
  * This class was originally used to ask the user for a list length and call on the Sortlist and Num class to display a sorted linked list.
  * However it's been edited to display a sorted STACKED list */
 
 public class Main{
     /** public class that accepts the desired list length
      */
         public static void main(String[] args){
             /** Main Function */
         Scanner sc = new Scanner(System.in);
         System.out.println("How many numbers do you want to add? ");
         int n = sc.nextInt();
         /** accepts user list length */
         
         Num listInUse = new Num();
         listInUse.addNumbers(n);
         /**connecting main function to num class */
 
         SortList sorted = new SortList();
         Stack<Integer> numbers = listInUse.getNumbers();
         sorted.sort(numbers);
         sorted.afterSort(numbers);
         /**connecting main function to sortlist class */
 
         sc.close();
         /**closing program */
         }
 }
