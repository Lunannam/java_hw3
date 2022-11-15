import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes.Name;

// public class hw_sem5 {
//  
//     public static void main(String[] args) {
//         Map<String, String> phonebook = new HashMap<String, String>();
//  
//         phonebook.put("11000005", "Саня");
//         phonebook.put("21000002", "Маша");
//         phonebook.put("31000003", "Вася");
//         phonebook.put("03000004", "Вася");
//         phonebook.put("03100014", "Петя");
//         
//         Set<String> phoneNumbers = phonebook.keySet();
//  
//         for (String phoneNumber : phoneNumbers) {
//             String name = phonebook.get(phoneNumber);
//             
//             System.out.println("Phone Number: " + phoneNumber + " ==> Name: " + name);
//         }
//     }
// }
// 

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности Имени
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class hw_sem5
{
    public static void main(String[] args) {
        
    
//Напишите тут ваш код
HashMap<String, String> map = new HashMap<String, String>();
map.put("A", "Oleg");
map.put("B", "Sasha");
map.put("C", "Andrey");
map.put("D", "Kolya");
map.put("E", "Vasya");
map.put("F", "Petya");
map.put("G", "Andrey");
map.put("H", "Oleg");
map.put("I", "Sasha");
map.put("J", "Andrey");

getCountTheSameFirstName(map, "Oleg") ;

}
public static int getCountTheSameFirstName(HashMap<String, String> map,     String name)
{
//Напишите тут ваш код
int count = 0;
for (String tmp : map.values())
{
    if(name.equals(tmp))
    {
        count++;
    }
}
System.out.print( name + ":" +count);
return count;
}
}

 // /а шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.

// 
// package fer;
// public class Ferz {
//     private int field[][] = new int[8][8];
//     static final String not = "abcdefgh";
//     public static void main(String[] arg) {
//         new Ferz().run();
//     }
//     public boolean full() {
//         for (int i = 0; i < 8; i++)
//             for (int j = 0; j < 8; j++)
//                 if (field[i][j] == 0)
//                     return false;
//         return true;
//     }
//     public void putFerz(int x, int y) {
//         for (int i = 0; i < 7; i++) {
//             // Процедура поставить ферзя. По горизонтали, вертикали
//             field[i][y]++;
//             field[x][i]++;
//             // и обеим диагоналям от позиции ферзя в каждую клетку добавляем по 1. В позицию ферзя добавляем 100. (не обязательно 100, но точно больше 4).
//             if (x - i >= 0) {
//                 if (y - i >= 0)
//                     field[x - i][y - i]++;
//                 if (y + i < 8)
//                     field[x - i][y + i]++;
//             }
//             if (x + i < 8) {
//                 if (y - i >= 0)
//                     field[x + i][y - i]++;
//                 if (y + i < 8)
//                     field[x + i][y + i]++;
//             }
//         }
//         field[x][y]+=100;
//     }
//     public void removeFerz(int x, int y) {
//         for (int i = 0; i < 7; i++) {
//             // Процедура снять ферзя. По горизонтали, вертикали
//             field[i][y]--;
//             field[x][i]--;
//             // и обеим диагоналям от позиции ферзя в каждую клетку добавляем по 1. В позицию ферзя добавляем 100. (не обязательно 100, но точно больше 4).
//             if (x - i >= 0) {
//                 if (y - i >= 0)
//                     field[x - i][y - i]--;
//                 if (y + i < 8)
//                     field[x - i][y + i]--;
//             }
//             if (x + i < 8) {
//                 if (y - i >= 0)
//                     field[x + i][y - i]--;
//                 if (y + i < 8)
//                     field[x + i][y + i]--;
//             }
//         }
//         field[x][y]-=100;
//     }
//     public void find(int level) {
//         // В процедуре поиска
//         if (level == 5) {
//             // Проверяем уровень. Если он =5, то проверяем наличие нулевых клеток. Если их нет, то это решение, его можно выводить.
//             if (full()) {
//                 //его можно выводить
//                 for (int i = 0; i < 8; i++)
//                     for (int j = 0; j < 8; j++)
//                         if (field[i][j] > 100) {
//                             System.out.print(""+not.charAt(i) + (j + 1) + " ");
//                         }
//                 System.out.println();
//             }
//             // Если уровень 5 и есть нулевые клетки - возврат.
//             return;
//         }
//         //перебираем все клетки по x и y от 1 до 8.
//         for (int i = 0; i < 8; i++)
//             for (int j = 0; j < 8; j++)
//                 if (field[i][j] == 0) {
//                     //   Если клетка нулевая ставим ферзя и вызываем следующую процедуру поиска с уровнем на 1 больше. Снимаем ферзя.
//                     putFerz(i, j);
//                     find(level + 1);
//                     removeFerz(i, j);
//                 }
//         //По окончании цикла - возврат
//     }
//     public void run() {
//         // Clear field
//         // Для этого достаточно создать доску типа int[8][8]. Обнулить.
//         for (int i = 0; i < 8; i++)
//             for (int j = 0; j < 8; j++)
//                 field[i][j] = 0;
//         // Далее запускаем процедуру поиска с уровнем 0 (нет поставленных ферзей)
//         find(0);
//     }
// }
