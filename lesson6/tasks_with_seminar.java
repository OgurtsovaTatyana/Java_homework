package lesson6;

//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Random;
//import java.util.TreeSet;

public class tasks_with_seminar {
    public static void main(String[] args) {
        // HashSet <Integer>my_set=new HashSet<>(Arrays.asList(1,2,3000,2,4,5000,6,3));
        // System.out.println(my_set);
        // LinkedHashSet <Integer>my_set2=new LinkedHashSet<>(Arrays.asList(1,2,3000,2,4,5000,6,3));
        // System.out.println(my_set2);
        // TreeSet <Integer>my_set3=new TreeSet<>(Arrays.asList(1,2,3000,2,4,5000,6,3));
        // System.out.println(my_set3);
        
        ArrayList <Integer> my_arr=new ArrayList<>(100);
        addRndom_arr(my_arr);
        System.out.println(my_arr);
        pers(my_arr);
    } 
    public static void addRndom_arr(ArrayList<Integer> arr){
    Random rand =new Random();
        for (int index = 0; index < 100; index++) {
            arr.add(rand.nextInt(70));   
        } 
    }
    public static void pers(ArrayList<Integer> arr){
        int sizeArr=arr.size();
        HashSet <Integer> hset_list=new HashSet<Integer> (arr);
        int size_hset_list=hset_list.size();
        Double pesent=(double) size_hset_list / (double) sizeArr;
        System.out.println(pesent*100);
        }
}