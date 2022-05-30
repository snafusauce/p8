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

         return list.get(list.size() - 1);
     }

     public T pop() {
         if (isEmpty()) {
             throw new EmptyStackException();
         }
         T p = list.get(list.size() - 1);
         list.remove(p);
         return p;
     }

     public T push(T element) {
         //
         list.add(element);
         return element;
     }

     public int search(T element) {
         // ...
         int index = list.indexOf(element);
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
