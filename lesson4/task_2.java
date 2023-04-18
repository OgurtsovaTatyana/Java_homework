package lesson4;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
// 2) Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class task_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList <String> my_list= new LinkedList<>(Arrays.asList("word1","word2","word3","word4","word5"));
        String text;
        //System.out.println("Введите  enq (поместить в конец) или deq (показать первый и удалить) first (показать первый), stop - выход ");
        
        int index=0;
        while (true){
        System.out.println("Введите  enq (поместить в конец) или deq (показать первый и удалить) first (показать первый), end - выход ");
        System.out.println(my_list);
        
        my_list.get(index);
        System.out.println("текущий элемент очереди "+ my_list.get(index));
        
        text=sc.nextLine().strip();
        if (text.equals("end")) {
            break; 
        }
        if (text.equals("enq")) {
            enqueue(my_list,index);
      
        }
        if (text.equals("dec")) {
            dequeue(my_list);
        }
         if (text.equals("first")) {
            first(my_list);
        }
        System.out.println(my_list);
        // зацикливание просмотра элементов
        if (index<my_list.size()-1){
            index++;
        }
        else {
            index=0;
        }
        }
        sc.close(); 
    }
    static void enqueue(LinkedList list, int index){
        list.addLast(list.get(index));  
        list.remove(list.get(index));  
    }
    static void dequeue(LinkedList list){
        System.out.println(list.pop()); 
    }   
    static void first(LinkedList list){
        System.out.println(list.getFirst());
    }   
}

  
 
        
        
                
      
    

