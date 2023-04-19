package lesson4;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.
public class task_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList <Integer> my_list= new LinkedList<Integer>();
        for (int index = 0; index < 10; index++) {
        my_list.add(rand.nextInt(10));} 
        System.out.println(my_list);
                
        my_list.sort(Comparator.reverseOrder());        
        System.out.println(my_list);
    }
}
