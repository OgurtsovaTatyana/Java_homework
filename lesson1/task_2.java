// Вывести все простые числа от 1 до 1000
public class task_2 {
   public static void main(String[] args) {
   
   System.out.println("простые числа: "); 
   for (int num = 1; num <= 1000; num++) {
    int flag=0;
        for (int index = 2; index < num; index++) {
            if (num%index>0){
            flag=1;
            } else {
            flag=0;
            break;
            }
        }
        if (flag>0) System.out.println(num);   
    
    } 
   
   } 
}
