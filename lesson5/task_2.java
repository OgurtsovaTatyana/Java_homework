package lesson5;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class task_2 {
    public static void main(String[] args) {
        HashMap<String,String> my_list=new HashMap<>();
        HashMap<String,Integer> my_list_sort=new HashMap<>();
        my_list.put("Иванов","Иван");
        my_list.put("Петрова","Светлана");
        my_list.put("Мусина","Анна");
        my_list.put("Крутова","Анна" );
        my_list.put("Юрин","Иван");
        my_list.put("Лыков","Петр" );
        my_list.put("Чернов","Павел");
        my_list.put("Чернышов","Петр" );
        my_list.put("Федорова","Мария");
        my_list.put("Светлова","Марина");
        my_list.put("Савина","Мария");
        my_list.put("Рыкова","Мария");
        my_list.put("Лугова","Марина");
        my_list.put("Владимирова","Анна" );
        my_list.put("Мечников","Иван" );
        my_list.put("Петин","Петр");
        my_list.put("Ежов","Иван" );
int n=0;  
// формирование словаря имен и их количества
        for(var item : my_list.entrySet()) { 
          //System.out.printf("[%s: %s]\n", item.getKey(), item.getValue());
            if (my_list_sort.containsKey(item.getValue())) {
                
                n=my_list_sort.get(item.getValue()); // количество имен текущее
                my_list_sort.put(item.getValue(),n+1);
                }
            else {
                my_list_sort.put(item.getValue(),1);
            }            
                }   
   
   //сортировка : здесь гугл помог)
my_list_sort.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);

            }
}