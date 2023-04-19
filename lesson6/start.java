package lesson6;
// Урок 6. Хранение и обработка данных ч3: множество коллекций Set
// 
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

import java.util.ArrayList;
import java.util.Scanner;

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих
public class start {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Asus",8,512, "Windows11","red");
        NoteBook notebook2 = new NoteBook("Lenovo",16,1024, "Windows10","grey");
        NoteBook notebook3 = new NoteBook("Нonor",8,1024, "Windows11","black");
        NoteBook notebook4 = new NoteBook("Hp",4,512, "linux","black");
        NoteBook notebook5 = new NoteBook("Haier",4,512, "Windows11","red");
        NoteBook notebook6 = new NoteBook("Apple",16 ,2048, "macOS","white");
       
        ArrayList<NoteBook> list_nb = new ArrayList<NoteBook>();
        list_nb.add(notebook1);
        list_nb.add(notebook2);
        list_nb.add(notebook3);
        list_nb.add(notebook4);
        list_nb.add(notebook5);
        list_nb.add(notebook6);
        
        print_list_nb(list_nb); // печать всего списка ноутбуков
       print_menu();
       search_menu();

    }// end public static void main


// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
static void print_menu(){
    System.out.println("Введите цифру, соответствующую необходимому критерию:\n"
    + " 1 - ОЗУ\n"
    + " 2 - Объем ЖД\n"
    + " 3 - Операционная система\n"
    + " 4 - Цвет\n");
}
static void print_list_nb( ArrayList<NoteBook> my_list) {
for (NoteBook item_nb : my_list) {
    item_nb.displayInfo(); // вывод ноутбука (исп функцию класса в NoteBook)
    
}
}
static void search_menu(){  // меню
    Scanner sc= new Scanner(System.in);
    Character choice= sc.next().charAt(0);
    Character criterion;
    switch (choice) {
        case '1':
        System.out.println("Введите минимальное значение для объема памяти ОЗУ");
        criterion=sc.next().charAt(0);
        System.out.println("Ваш выбор:");
            break;
        case '2':
        System.out.println("Введите минимальное значение для объема памяти жесткого диска");
        criterion=sc.next().charAt(0);
        System.out.println("Ваш выбор:");
        break;
        case '3':
        System.out.println("Выберите тип операционной системы");
        criterion=sc.next().charAt(0);
        System.out.println("Ваш выбор:");
            break;
         case '4':
        System.out.println("Выберите цвет");
        criterion=sc.next().charAt(0);
        System.out.println("Ваш выбор:");
        break;
        default:
        System.out.println("Неверно введен номер");
            break;
    }
  
    sc.close();
}

}// end class start