
import java.util.Collections;
import java.util.Stack;
/**
 This class sorts a Stacked list 
 @param Sortlist numbers the Stacked list of integers to sort. */

/** This class was originally used to sort unsorted Linked List, however it's been changed to sort a STACKED list data type. */

public class SortList {
    /** class that sorts unsorted Stacked List */
    public void sort(Stack<Integer> numbers){
        /** Stacked List */
        Collections.sort(numbers);
        /** sort function */
    }
    public void afterSort(Stack<Integer> numbers){   
        System.out.println("Stack List after sorting: " + numbers);
        /** prints sorted Stacked List */
        }
    }
