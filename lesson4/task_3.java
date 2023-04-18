package lesson4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1
// +
// 2
// ответ:
// 3
// +
// 4
// ответ:
// 7
// +
// 2
// ответ:
// 9
// 1
// Ответ 8
// Отмена -> 9
// Отмена -> 7
// Отмена -> 3
// +
// 2
// Ответ 5
public class task_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList <Integer> my_list = new LinkedList<>();
        
        System.out.println("ввдите первое число");
        int res=sc.nextInt();
        System.out.println("ввдите знак +,-,*,/ ");
        
        Character simbol=sc.next().charAt(0);
        int number2;
       
        while (true){ 

        if (simbol=='o') {
            my_list.removeLast();
           res=my_list.getLast();
           System.out.println("Ответ:");
           System.out.println(res);
            
        }
        else {
        System.out.println("ввдите второе число");
        number2=sc.nextInt();
        if (simbol=='q') break; 
        if (simbol=='+') res=res + number2;
        if (simbol=='-') res=res - number2;
        if (simbol=='*') res=res * number2;
        if (simbol=='/') res=res / number2;
        System.out.println("Ответ:");
        System.out.println(res);
        my_list.offer(res);
        }
        System.out.println("ввдите знак +,-,*,/ или о для отмены операции");
        simbol=sc.next().charAt(0);
        
    };
    sc.close();
    }   
}
