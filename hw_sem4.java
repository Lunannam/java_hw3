
import java.util.*; 
// public class hw_sem4 {
//     // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//     public class LinkedListTest1 { 
//     
//         public static void main(String[] args) 
//     
//         { 
//     
//             LinkedList<String> ll = new LinkedList<String>(); 
//     
//             ll.add("1"); 
//     
//             ll.add("2"); 
//     
//             ll.add("3"); 
//     
//             System.out.print("Начальный LinkedList: " + ll); 
//     
//             ll = reverseLinkedList(ll); 
//     
//             System.out.print("\nПеревернутый LinkedList: " + ll); 
//     
//         } 
//     
//         public static LinkedList<String> reverseLinkedList(LinkedList<String> ll) 
//     
//         { 
//     
//             LinkedList<String> reverseLinkedList = new LinkedList<String>(); 
//     
//             for (int i = ll.size() - 1; i >= 0; i--) { 
//     
//                 reverseLinkedList.add(ll.get(i)); 
//     
//             }
//     
//             return reverseLinkedList; 
//     
//         } 
//     } 
//        
// }
// 
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// public class hw_sem4 {
// 
//     public static void first(Deque<Integer> deque) {
//         
//         System.out.println("First element in queue: " + ((Deque<Integer>) deque).getFirst());    
//     }
//     public static void enqueue(Deque<Integer> deque) {
//         deque.addLast(7);
//         System.out.println("New queue - last new element added" + deque);  
//     }
// 
//     public static void dequeue(Deque<Integer> deque) {
//     
//         System.out.println("first element  " + ((Deque<Integer>) deque).getFirst()); 
//         deque.removeFirst();
//         System.out.println("New queue - fiment deleted " + deque);  
//     }
//     public static void main(String[] args) {
//        Deque<Integer> deque = new ArrayDeque<>();
//     
//        deque.addFirst(6); 
//        deque.addFirst(5); 
//        deque.addFirst(4); 
//        deque.addFirst(3); 
//        deque.addFirst(2); 
//        deque.addFirst(1); 
//         System.out.println("Added Queue in memory: " +deque); 
//         first(deque);
//         enqueue(deque);
//         dequeue(deque);
//     }
// }

import java.util.Scanner;
public class hw_sem4{

public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    // Scanner in = new Scanner(System.in);
    
    char operation;
    int a;
    int b;
    
     System.out.println("Enter First Number");
    
    a = in.nextInt();
    
    System.out.println("Enter Operation");
    
    operation = in.next().charAt(0);
    
    System.out.println("Enter Second Number");
    
    b = in.nextInt();
    
    if (operation == '+')
    {
        System.out.println("your answer is " + (a + b));
    }
    if (operation == '-')
    {
        System.out.println("your answer is " + (a - b));
    }
    if (operation == '/')
    {
        if (b !=0){
        System.out.println("your answer is " + (a / b));
        } else{
            System.out.println("Attention!!!! Mistake!!! division by zero impossible " );
        } 
        
    }
    if (operation == '*')
    {
        System.out.println("your answer is " + (a * b));
    }
    
    }
    
}    
