package lesson2;
import java.util.Arrays;
import java.io.FileWriter;

public class task_1 {
    public static void main(String[] args) {
        int [] arr=new int[] {6,9,4,8,3,1,6,7,5,2};
        f_sort(arr);  
    }

static void f_write(String item){
    try(FileWriter writer= new FileWriter("lesson2/longir.txt",true))
    {
        writer.write(item);
        writer.close();  
    } 
    
     catch (Exception ex) {
        System.out.print(ex.getMessage()); 
    }
} //end static void f_write
static void f_sort(int [] arr) {
    int min; 
    int count=arr.length;
    
    for (int index = 0; index <arr.length; index++) {
       
    for (int j = 1; j< count; j++) {
        if (arr[j]<arr[j-1]) {
            min=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=min;
            

        }
        for (int item: arr) {
        System.out.printf("%d ",item);
        }   
        System.out.printf(" \n");
        String stroka=Arrays.toString(arr)+"\n";
        f_write(stroka);
    }
    count=count-1;
    }   
} //end static void f_sort
} //end public class task_1
