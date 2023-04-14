import java.util.Scanner;

/*Задча1:
Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */
/**
 * task_1
 */
public class task_1 {
public static void main(String[] args) {
    System.out.println("ввдите число n");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    
    int sum=0;
    int mult=1;
    for (int index = 1; index <= number; index++) {
        sum=sum+index;
        mult=mult*index;
    }
    System.out.printf(" Сумма чисел от 1 до %d = %d \n произведение чисел от 1 до %d = %d \n",number,sum,number,mult);
    
sc.close();
}
    
}

