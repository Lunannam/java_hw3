import java.util.ArrayList;

// 1) Реализовать алгоритм сортировки слиянием



// 2) Пусть дан произвольный список целых чисел, удалить из него четные числа
// 
// public class hw_sem3 {
//     public static void main(String[] args) {
//         ArrayList <Integer> number =new ArrayList<Integer>() ;
// 
//         number.add(15);
//         number.add(42);
//         number.add(12);
//         number.add(100);
//         number.add(37);
// 
//         System.out.println("massive: "+number);
// 
//         for (int i=0;i<number.size();i++){
//             int ost=number.get(i)%2;
//         
//             if (ost==0){
//                 number.remove(i);
//         
//                 // Add this:
//                 i--;
//             }
//         }
//         System.out.println(number);
//     }
//     
// }
// 
// 3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

// public class hw_sem3 {
// 
//     public static void main(String[] args) {
//         ArrayList <Integer> number =new ArrayList<Integer>() ;
// // 
//         number.add(15);
//         number.add(42);
//         number.add(12);
//         number.add(100);
//         number.add(37);
//        int sum = 0;
//         
//         for(int i=0;i<number.size();i++) {
//         sum+=number.get(i);
//         }
//         
//         System.out.println("среднее арифметическое :" + sum/number.size());
//         
//         int min = number.get(0);
//         int max = number.get(0);
//        
//         for (Integer i: number) {
//             if(i < min)
//                 min = i;
//             if(i > max)
//                 max = i;
// 
// }
// System.out.println("минимальное число: " + min);
// System.out.println("максимальное число: " + max);
// 
// }
// 
// }
// 