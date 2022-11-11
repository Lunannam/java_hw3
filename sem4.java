import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

import javax.xml.stream.events.StartDocument;

// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

// public class sem4 {
//     public static void main(String[] args) {
//         ArrayList<Integer> al = new ArrayList<Integer>();
//         LinkedList<Integer> ll = new LinkedList<Integer>();
//         long startTime = System.currentTimeMillis();
//         
//         for (int i = 0; i < 100000; i++) {
//             al.add(0,i); 
//         }
//         System.out.println(System.currentTimeMillis()-startTime);
//         
//         long startTime2 = System.currentTimeMillis();
// 
//         for (int i = 0; i < 100000; i++) {
//             ll.add(0,i);
//         }
//         System.out.println(System.currentTimeMillis()-startTime2);
//     }
// }
//     
// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

/**
 * sem4
 */
// public class sem4 {
// 
//     public static void main(String[] args) {
//         
//         LinkedList<String> ll = new LinkedList<String>();
//         Scanner input = new Scanner(System.in);
//         String elem = new String();
// 
//         while (true) {
//         System.out.print("Enter string: ");
//         elem = input.next();
//         if (elem.equals("stop")) {
//         break;
//         }
//         String[] split_elem = elem.split("~");
//         if (split_elem[0].equals("print")) {
//             int index = Integer.parseInt(split_elem[1]);
//             deleteElement(ll,index);
// 
//         }
//         else {
//             addElement(ll,split_elem);   
//         }
//         System.out.println(ll);
//     }
//     input.close();
//     System.out.println(ll);
// }
// static LinkedList<String> addElement (LinkedList<String> temp_list, String[] temp){
//     temp_list.add(Integer.parseInt(temp[1]), temp[0]);
//     return temp_list;
// }
// 
// static LinkedList<String> deleteElement (LinkedList<String> temp_list, int i){
//     System.out.println(temp_list.get(i));
//     temp_list.remove(i);
//     return temp_list;
// }
// 
// }
// 
// 

/**
 * sem4
 */
public class sem4 {
    public static void AddStack(int[] arr) {
        Stack st = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        while (!st.empty()) {
            System.out.print(st.pop() +" ");
        }
        // for (int i = st.size(); i >0; i--) {
        //     System.out.print(st.pop() +" ");
        // } 
            
        }

        public static void AddLinkedList(int[] arr) {
            LinkedList<Integer> ll = new LinkedList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                ll.add(arr[i]);
            }
            System.out.print(ll);
            }

    public static void main(String[] args) {
// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

// 2) Написать метод, который принимает массив элементов, помещает их в linkedList и затем выводит его.
        int [] arr = new int[] {1,2,3,4,5,6};
        AddStack(arr);
        System.out.println();
        AddLinkedList(arr);
    

}
}