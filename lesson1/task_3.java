import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ввдите первое число");
    int number1=sc.nextInt();
    System.out.println("ввдите знак");
    Character simbol=sc.next().charAt(0);
    System.out.println("ввдите второе число");
    int number2=sc.nextInt();
    int res=0;
    System.out.println(simbol);
    if (simbol=='+') res=number1 + number2;
    if (simbol=='-') res=number1 - number2;
    if (simbol=='*') res=number1 * number2;
    if (simbol=='/') res=number1 / number2;
    System.out.println(res);
    sc.close();
}
}

