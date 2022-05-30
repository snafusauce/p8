/**
 * Author: Suki Sahota
 */
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

 public class MyStack<T> extends MyArrayList<T> {
    
     public MyStack(Class<T[]> arrClass) {
         super(arrClass);
     }

     private List<T> list = new ArrayList<T>();
     
     //did not work
     //MyArrayList<T> myFirstArr = new MyArrayList<T>(T[].class);
     
     public boolean empty() {
        
         return list.isEmpty();
     }

     public T peek() {
         if (isEmpty()) {
             throw new EmptyStackException();
         }

         return null;
     }

     public T pop() {
         if (isEmpty()) {
             throw new EmptyStackException();
         }

         return null;
     }

     public T push(T element) {
         //
         list.add(element);
         return element;
     }

     public int search(T element) {
         // ...
         return -1;
     }
 }

/**
 * Usage in main():
 * MyStack<Integer> myFirstStk = new MyStack<Integer>(Integer[].class);
 * myFirstStk.add(5);
 * ...
 *
 * MyStack<String> mySecondStk = new MyStack<String>(String[].class);
 * mySecondStk.add("Hello World");
 * ...
 */
