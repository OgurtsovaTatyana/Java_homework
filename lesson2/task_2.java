package lesson2;
import java.io.FileReader;
import java.io.BufferedReader;

public class task_2 {
 public static void main(String[] args) {
    f_read();
} 

static void f_read(){
    try(FileReader freader= new FileReader("lesson2/task_2.txt"))
    {
     BufferedReader breader = new BufferedReader(freader);
        for (int index = 0; index < 2; index++) {        
        String line = breader.readLine();
        f_print(line);     
        } 
        breader.close();  
    } 
    
     catch (Exception ex) {
        System.out.print(ex.getMessage()); 
    }
} //end static void f_read 

static void f_print(String line){
    String [] words=line.split(",");
    String[] print_words=new String[]{" получил "," по предмету ",""};  
    int i=0;
    StringBuilder result = new StringBuilder();
    for(String word : words){             
        String[] word_item=word.split(":");
        StringBuilder builder = new StringBuilder(word_item[1]);
        builder.deleteCharAt(0);
        builder.deleteCharAt( builder.length()-1);
        result.append(builder+print_words[i]);
        i++;
    }
    System.out.println(result);
 
}
}