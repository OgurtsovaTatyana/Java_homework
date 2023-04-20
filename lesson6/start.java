package lesson6;
// Урок 6. Хранение и обработка данных ч3: множество коллекций Set
import java.util.ArrayList;
import java.util.Scanner;
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
        
        //print_list_nb(list_nb); // печать всего списка ноутбуков
        print_menu();
        search_menu(list_nb);

    }// end public static void main

static void print_menu(){
    System.out.println("Введите цифру, соответствующую необходимому критерию:\n"
    + " 1 - ОЗУ\n"
    + " 2 - Объем ЖД\n"
    + " 3 - Операционная система\n"
    + " 4 - Цвет\n");
}
// вывод ноутбука (исп функцию класса в NoteBook)
static void print_list_nb( ArrayList<NoteBook> my_list) {
for (NoteBook item_nb : my_list) {
    item_nb.displayInfo();   
}
}
//функции фильтры:
//озу
static void search_Ram(Integer item_ram, ArrayList<NoteBook> my_list){
    for (NoteBook item_nb : my_list) {
        if (item_nb.getRam() >item_ram) item_nb.displayInfo();   
    }
}
//hdd
static void search_Hdd(Integer item_hdd, ArrayList<NoteBook> my_list){
    for (NoteBook item_nb : my_list) {
        if (item_nb.getHdd() >item_hdd) item_nb.displayInfo();   
    }
}
// операционная система
static void search_OS(String item_os, ArrayList<NoteBook> my_list){
   Boolean res=false; 
        for (NoteBook item_nb : my_list) {
        if ( item_os.equalsIgnoreCase(item_nb.getOS()) ) {
            item_nb.displayInfo();}   
            else {
                res=true;
                
            }
        }
        if (res) System.out.println("Такого товара нет");
    }
// цвет
static void search_Color(String item_col, ArrayList<NoteBook> my_list){
    Boolean res=false; 
         for (NoteBook item_nb : my_list) {
         if ( item_col.equalsIgnoreCase(item_nb.getColor()) ) {
             item_nb.displayInfo();}   
             else {
                 res=true;
                 
             }
         }
         if (res) System.out.println("Такого товара нет");
     }

public static void search_menu(ArrayList<NoteBook> my_list){  // меню
    Scanner sc= new Scanner(System.in);
    Character choice= sc.next().charAt(0);
    String str_criterion=sc.nextLine();
    Integer int_criterion;
    switch (choice) {
        case '1':
        System.out.println("Введите минимальное значение для объема памяти ОЗУ");
        int_criterion=sc.nextInt();
        System.out.println("Товары в наличии по вашему запросу:");
        search_Ram(int_criterion,my_list);
        break; 

        case '2':
        System.out.println("Введите минимальное значение для объема памяти жесткого диска");
        int_criterion=sc.nextInt();
        System.out.println("Ваш выбор:");
        search_Hdd(int_criterion,my_list);
        break;
        case '3':
        System.out.println("Выберите тип операционной системы");
        str_criterion=sc.nextLine();
        str_criterion.strip();
        System.out.println("Ваш выбор:"+ str_criterion);
        search_OS(str_criterion,my_list);
        break;

        case '4':
        System.out.println("Выберите цвет");
        str_criterion=sc.nextLine();
        str_criterion.strip();
        System.out.println("Ваш выбор:"+ str_criterion);
        search_Color(str_criterion,my_list);
        break;

        default:
        System.out.println("Неверно введен номер");
            break;
    }
  
    sc.close();
}

}// end class start