// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
import java.util.*;

// public class sem5 {
//     public static void searchName(Map<Integer, String> map, String surname) {
//         
//         for (var item : map.entrySet()) {
//             if (item.getValue().equals(surname)) {
//                 System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Map<Integer, String> map = new HashMap<Integer, String>();
//         map.put(123456, "Иванов");
//         map.putIfAbsent(321456, "Васильев");
//         map.putIfAbsent(234561, "Петрова");
//         map.putIfAbsent(234432, "Иванов");
//         map.putIfAbsent(654321, "Петрова");
//         map.putIfAbsent(345678, "Иванов");
//         System.out.println(map);
//         searchName(map, "Иванов");
//     }
// 
//     
// }
// 
// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
// если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true
// import java.util.Map;
// public class sem5 {
//     
//     public static Boolean checkSymbols(String word1, String word2) {
//         
//         Map <String, String> map = new HashMap<String,String>();
//         if (word1.length()!=word2.length()) {
//             return false;  
//         }
// 
//         var wordArr1 = word1.split("");
//         var wordArr2 = word2.split("");
// 
//         for (int i = 0; i < wordArr1.length; i++) {
//             if (map.containsKey(wordArr1[i])) {
//                 if (! map.get(wordArr1[i]).equals(wordArr2[i])) {
//                     return false;
//                     
//                 }
//                 else{
//                     map.putIfAbsent(wordArr1[i], wordArr2[i]);
//                     
//                 }
//             }
//         }
//         return true;
//     }
// 
//     public static void main(String[] args) {
// 
//        System.out.println(checkSymbols("paper", "tille")); 
//         
//     }
// }
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

// public class sem5 {
//     public static void main(String[] args) {
//     Stack<Character> st = new Stack<>();
//     String equation = "[a+(1*3)";
//     Map<Character, Character> chars = new HashMap<>();
//     chars.put('}', '{');
//     chars.put(')', '(');
//     chars.put(']', '[');
//     chars.put('>', '<');
//     
//     boolean t = true;
//     for (int i = 0; i < equation.length(); i++) {
//     if(chars.containsValue(equation.charAt(i))){
//     st.add(equation.charAt(i));
//     } else if (chars.containsKey(equation.charAt(i))){
//     char a = st.pop();
//     if (a != chars.get(equation.charAt(i)) || !st.isEmpty()){
//     t = false;
//     break;
//     }
//     }
//     }
//     if(t){
//     System.out.println("True");
//     } else {
//     System.out.println("False");
//     }
//     
//     
//     }
//     }

def parse(s):
    result = []
    digit = ""
    for symbol in s:
        if symbol.isdigit():
            digit += symbol
        else:
            result.append(float(digit))
            digit = ""
            result.append(symbol)
    else:
        if digit:
            result.append(float(digit))
    return result


def calculate(lst):
    result = 0.0
    while '*' in lst:
        index = lst.index('*')   #3
        result = lst[index - 1] * lst[index + 1] #30
        #[12, '+', 3, '*', 10, '+', 2.0]
        #[12, '+', 30, '+', 2.0]
        lst = lst[:index - 1] + [result] + lst[index + 2:]
    while '/' in lst:
        index = lst.index('/')
        result = lst[index - 1] / lst[index + 1]
        lst = lst[:index - 1] + [result] + lst[index + 2:]
    while '+' in lst:
        index = lst.index('+')
        result = lst[index - 1] + lst[index + 1]
        lst = lst[:index - 1] + [result] + lst[index + 2:]
    while '-' in lst:
        index = lst.index('-')
        result = lst[index - 1] - lst[index + 1]
        lst = lst[:index - 1] + [result] + lst[index + 2:]
    return result


s = "12+3*10+2/2"
result = parse(s)

print(result)
print(calculate(result))