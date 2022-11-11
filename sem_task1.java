import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.naming.InitialContext;

// Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});


// public class sem_task1 {
//     public static void main(String[] args) {
//         
//     
//     String s1 = "hello";
//     String s2 = "hello";
//     String s3 = s1;
//     String s4 = "h" + "e" + "l" + "l" + "o";
//     String s5 = new String("hello");
//     String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//     System.out.println(s1==s2);
//     System.out.println(s3==s4);
//     System.out.println(s5==s6);
//     System.out.println(s1.equals(s2));
//     System.out.println(s3.equals(s4));
//     System.out.println(s5.equals(s6));
//     }
// 
// }

// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

// public class sem_task1 {
//     public static void main(String[] args) {
//         ArrayList <Integer> list = new ArrayList<>();
//         Random rnd = new Random();
//         for (int i= 0; i < 10; i++) {
//             list.add(rnd.nextInt(1,11));
//             
//         }
//         list.sort(Comparator.naturalOrder());
//         System.out.println(list);
//     }
// }

// Заполнить список названиями планет Солнечной системы в произвольном 
// порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.
//     

// public class sem_task1 {
//     public static void main(String[] args) {
//         ArrayList planet = new ArrayList<>();
//         
//         planet.add("Земля");
//         planet.add("Марс");
//         planet.add("Сатурн");
//         planet.add("Венера");
//         planet.add("Юпитер");
//         planet.add("Солнце");
//         planet.add("Венера");
//         planet.add("Юпитер");
//         int count = 1;
//         for (int i= 0; i < planet.size(); i++) {
//             for (int j = i+1; j < planet.size(); j++) {
//                 if (planet.get(i).equals(planet.get(j))) {
//                     count++;
//                     
//                 }
//             }
//             System.out.printf("%s %d \n", planet.get(i), count);
//             count =1;
//         // System.out.println(count);
//         }
//     }
// }
// // 
// public class sem_task1 {
//     public static void main(String[] args) {
//         ArrayList <String> planet = new ArrayList<>( 8);
//         
//         planet.add("Земля");
//         planet.add("Марс");
//         planet.add("Сатурн");
//         planet.add("Венера");
//         planet.add("Юпитер");
//         planet.add("Солнце");
//         planet.add("Венера");
//         planet.add("Юпитер");
//         System.out.println(planet);
//         planet.sort(Comparator.naturalOrder());
//         String temp = planet.get(0);
//         int count = 1;
//         for (int i= 0; i < planet.size(); i++) {
//             
//                 if (planet.get(i) == temp) {
//                     count++;
//                     
//                 }
//                 else{
//             
//                 System.out.printf(count + " " + temp + " , ");
//                 temp = planet.get(i);
//                 count =1;
//                 }
//         // System.out.println(count);
//         }
//         System.out.printf(count + " " + temp + " ");
//         
//         }
//     }
// 

// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
public class sem_task1 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList<>();
       
        array.add("Земля");
        array.add(1);
        array.add("Сатурн");
        array.add("Вера");
        array.add(35);
        System.out.println(array);
       
        for (int i= 0; i < array.size(); i++) {
            if (array.get(i) instanceof Integer) {
            array.remove(i);
            i-=1;
            }   
        }
        System.out.println(array);
    }
}
    
