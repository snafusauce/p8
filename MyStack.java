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

     //private List<T> list = new ArrayList<T>();
     
     public boolean empty() {
        
         return super.isEmpty();
     }

     public T peek() {
         if (super.isEmpty()) {
             throw new EmptyStackException();
         }

         return super.get(super.size() - 1);
     }

     public T pop() {
         if (super.isEmpty()) {
             throw new EmptyStackException();
         }
         T p = super.get(super.size() - 1);
         super.remove(p);
         return p;
     }

     public T push(T element) {
         //
         super.add(element);
         return element;
     }

     public int search(T element) {
         // ...
         int index = super.indexOf(element);
         return index;
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
