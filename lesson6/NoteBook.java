package lesson6;
public class NoteBook{
    private String model;    // модель
    private int ram;// 1 - ОЗУ
    private int hdd;// 2 - Объем ЖД
    private String os;// 3 - Операционная система
    private String color;// 4 - Цвет
    
    NoteBook(String model, int ram,int hdd,String os,String color){
             
        this.model   = model;
        this.ram = ram;
        this.hdd  = hdd;
        this.os=os;
        this.color=color;
        }
    public Integer getRam() {
        return ram;
    }    
    public Integer getHdd() {
        return hdd;
    }
    public String getModel() {
        return model;
    }
    public String getOS() {
        return os;
    }
    public String getColour() {
        return color;
    }
    public void displayInfo(){
            System.out.printf("Model: %s\t RAM: %dгб\t HDD: %dгб\t OS: %s\t Color: %s \n", model, ram,hdd,os,color);
        } 
    }    

