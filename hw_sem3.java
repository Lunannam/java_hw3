import java.util.ArrayList;
import java.util.Arrays;
 
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
// Реализация сортировки слиянием на Java
public class hw_sem3 {
    public static void main(String[] args) {
        int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
        int[] result = mergesort(array1);
       
        System.out.println(Arrays.toString(result));
    }
 
    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }
 
    /**
     * 
     * @param buffer1 Массив для сортировки.
     * @param buffer2 Буфер. Размер должен быть равен размеру buffer1.
     * @param startIndex Начальный индекс в buffer1 для сортировки.
     * @param endIndex Конечный индекс в buffer1 для сортировки.
     * @return
     */
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        
        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
        
        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}