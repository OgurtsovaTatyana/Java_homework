package lesson3;

import java.util.ArrayList;

import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        Random rand=new Random();
        int list_size=rand.nextInt(1,20);
        ArrayList <Integer> my_list=new ArrayList<Integer>();
        for (int index = 0; index < list_size; index++) {
            my_list.add(rand.nextInt(10));
        }
       System.out.printf("my_list of %d elements: ", list_size);
       System.out.println(my_list);  
   
        for (int index = 0; index < my_list.size(); index++) {
            if (my_list.get(index)%2>0){
                my_list.remove(index);
                index=index-1;
            }
        }
    System.out.println(my_list);  
    }
}
