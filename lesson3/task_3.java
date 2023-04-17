package lesson3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        Random rand=new Random();
        Integer list_size= 10;
        ArrayList <Integer> my_list=new ArrayList<Integer>();
        for (int index = 0; index < list_size; index++) {
            my_list.add(rand.nextInt(10));
        }
       System.out.printf("my_list of %d elements: ", list_size);
       System.out.println(my_list);  
   int min=my_list.get(0);
   int max=my_list.get(0);
   Integer sum=0;
       for (int item : my_list) {
        if (item<min) min=item;
        if (item>max) max=item;
        sum=sum+item;
       }
    Double sr=sum.doubleValue()/list_size.doubleValue();
    System.out.printf(" min= %d, max= %d, sr= %.2f ",min,max,sr);  
    }

 
    
}
