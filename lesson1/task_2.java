// Вывести все простые числа от 1 до 1000
public class task_2 {
   public static void main(String[] args) {
   int flag=0;
   System.out.println("простые числа: "); 
   for (int num = 1; num <= 10; num++) {
        for (int index = 1; index < num; index++) {
            if (num%index>0){
            flag=1;
            } else {
            flag=0;
            break;
            }
        }
        System.out.println("f="+flag); 
        if (flag>0) System.out.println(num);   
    
    } 
   
   } 
}
