package lesson6;
// Урок 6. Хранение и обработка данных ч3: множество коллекций Set
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих
public class note_Book {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Asus",8,512, "Windows11","red");
        notebook1.displayInfo();
    }
}
class NoteBook{
    String model;    // модель
    int ram;// 1 - ОЗУ
    int hdd;// 2 - Объем ЖД
    String os;// 3 - Операционная система
    String color;// 4 - Цвет
    NoteBook(String model, int ram,int hdd,String os,String color){
         
        this.model   = model;
        this.ram = ram;
        this.hdd  = hdd;
        this.os=os;
        this.color=color;
    }
    void displayInfo(){
        System.out.printf("Model: %s\t RAM: %dгб\t HDD: %dгб\t OS: %s\t Color: %s \n", model, ram,hdd,os,color);
    } 
}