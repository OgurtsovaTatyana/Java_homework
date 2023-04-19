package lesson4;
import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Random;
import java.util.Scanner;
//консольное приложение 1
public class task_with_seminar {
    public static void main(String[] args) {
    //     LinkedList <String> my_list= new LinkedList();
    //     System.out.println("Введите стороку или print~num для вывода, stop - выход ");
    //     Scanner sc=new Scanner(System.in);
    //     String text="";
    //     int i;
    //    while (!text.equals("stop")) {
    //     text=sc.nextLine().strip();
        
    //     if (text.startsWith("print~")) {
    //         String index=text.substring(2);
    //         i =Integer.parseInt(index);
    //         System.out.println(my_list.get(i));
    //         my_list.remove(i);
    //         System.out.println(my_list);
    //     }
    //     else{
    //     my_list.add(text);
    //     }
    //    } 
                 
    //   sc.close(); 

//консольное приложение 2
    Deque <String> dq=new ArrayDeque<>()  ;
    System.out.println("Введите стороку или stop - выход ");
    Scanner sc=new Scanner(System.in);
    String text="";
    //int i;
    while (true) {
        text=sc.nextLine().strip();
        if(text.equals("print")){
            System.out.println(dq);
            String first=dq.removeFirst();
            String last=dq.removeLast();
            dq.addLast(first);
            dq.addFirst(last);
            System.out.println(dq);
            break;
        }
        else{
            dq.add(text);
        }
        
    };
System.out.println(dq);
sc.close();
    }
}
