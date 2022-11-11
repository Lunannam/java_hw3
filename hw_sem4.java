
import java.util.*; 
public class hw_sem4 {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    public class LinkedListTest1 { 
    
        public static void main(String[] args) 
    
        { 
    
            LinkedList<String> ll = new LinkedList<String>(); 
    
            ll.add("1"); 
    
            ll.add("2"); 
    
            ll.add("3"); 
    
            System.out.print("Начальный LinkedList: " + ll); 
    
            ll = reverseLinkedList(ll); 
    
            System.out.print("\nПеревернутый LinkedList: " + ll); 
    
        } 
    
        public static LinkedList<String> reverseLinkedList(LinkedList<String> ll) 
    
        { 
    
            LinkedList<String> reverseLinkedList = new LinkedList<String>(); 
    
            for (int i = ll.size() - 1; i >= 0; i--) { 
    
                reverseLinkedList.add(ll.get(i)); 
    
            }
    
            return reverseLinkedList; 
    
        } 
    } 
       
}
