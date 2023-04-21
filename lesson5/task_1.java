package lesson5;
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class task_1 {
public static void main(String[] args) {
    HashMap<String, ArrayList <String> > phoneBook =new HashMap<>();
    Scanner sc=new Scanner(System.in);
    Boolean flag=true;
    while(flag){
        System.out.println("Введите:\n"
        + " 1 - Добавление номера \n"
        + " 2 - Вывод Телефонной книги \n"
        + " 3 - Вывод Телефонной книги \n");
    Character choice=sc.nextLine().charAt(0);
    switch (choice) {
        case '1':
            System.out.println("введите фамилию");
            String name=sc.nextLine();
            System.out.println("введите номер телефона");
            String phone=sc.nextLine();
            ArrayList <String> list=new ArrayList <String>() ;
            if (phoneBook.containsKey(name) ) {
                list=phoneBook.get(name);
                list.add(phone);
                phoneBook.put(name, list);
            }
            else {
                list.add(phone);
                phoneBook.put(name, list);
            }
            break;
        case '2':
            for(var item : phoneBook.entrySet()) { //foreach
                String s = String.join(", ", item.getValue());
                System.out.println(item.getKey()+": " + s);
            }
            break;
        case '3':
            flag=false;
            break;
        default:
            break;
    }
    
    }
sc.close();
}//end public static void main(String[] args)

    
}//end public class task_1
