package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000
public class task_3 {
//проверяет можно ли поставить ферзя
    public static boolean examArr (int [][] array,Integer stroka,Integer stolb) {
       // Boolean res= true;
        for (int index = 0; index <8; index++) {
            if (array[index][stolb]==1 || array[stroka][index]==1) return false;//проверка по прямым
            }
            
        if (stroka>=stolb){ //проверка по диагоналям 1, если элемент левее центральной диагонали
            int startStroka1=stroka-stolb; 
            int startStroka2=stroka+stolb;   
            int i = 0;
            while(startStroka1<8) {// 1-линия вниз слева направо
                    if (array[startStroka1][i]==1) return false;
                    startStroka1++;
                    i++;
            }   
            if  (startStroka2>7) {// 2-линия вверх слева направо
                startStroka2=7;   
                i=stolb+stroka-7; 
                while(i<8) { 
                    if ( array[startStroka2][i]==1 ) return false;
                        startStroka2--;
                        i++;
                } 
            }
            else {
                i = 0;   
                while(startStroka2>=0) { 
                    if ( array[startStroka2][i]==1 ) return false;
                        i++;
                        if (startStroka2==0) {
                            break;
                        }
                        else startStroka2--;
                }     
            }                      
        }//проверка по диагоналям 1

        if (stroka<stolb){ //проверка по диагоналям2, если элемент правее центральной диагонали
            int startStolb1=stolb-stroka; 
            int startStolb2=stroka+stolb;   
            int i = 0; 
            while(startStolb1<8) {// 1-линия вниз слева-направо
                if (array[i][startStolb1]==1) return false;
                    startStolb1++;
                    i++;
            }   

            if  (startStolb2>7)  { // 2-линия вниз справа налево
                startStolb2=7;   
                i=stroka+stolb-7; 
            while(i<8) {  
                if ( array[i][7]==1 ) return false; 
                    startStolb2--;
                    i++;
                    } 
            } 
            else{
            i = 0;
            while(startStolb2>=0) {  // 2-линия вниз справа налево
                if ( array[i][startStolb2]==1 ) return false;                     
                i++;
                if (startStolb2==0){
                    break;
                }
                else startStolb2--;
                }           
            }         
                   
        }//проверка по диагоналям 2
        return true;   
    }// end f examArr

   //заполнение массива 
    public static int [][] StartArr (int [][] array,Integer stroka,Integer stolb){
    for (int str =0; str < 8; str++) {  //str -строка
        for (int index = 0; index < 8; index++) { //index -столбец
            array [str ][index]=0;
        }    
    } 
    return array;
    }
    
    public static void main(String[] args) {
        int [][] my_arr= new int [8][8];
        int count=0;
       StartArr( my_arr,0,0); // //начальное заполнение массива -0
        count=0; //  счетчик ферзей

//заполнение доски случайными образом вариант1
        while (count<7){    
            int iter=0;
            count=0;
            StartArr( my_arr,0,0); 
            while (iter<100){

            Random rand=new Random();
            int  hj=rand.nextInt(7);
            int col=rand.nextInt(7);
            
            if (examArr(my_arr,hj,col)) {
                my_arr [hj][col]=1;
                count++;
            }
            iter++;
            //System.out.println(iter);
            }    
        }// end случайные числа

//заполнение доски случайными образом вариант2
//         while (count<3){
//         for (int index = 0; index < 8; index++) {
//         Random rand=new Random();
//         int  hj=rand.nextInt(7);
//         if (examArr(my_arr,index,hj )){
//                         my_arr [index][hj]=1;
//                         count++;     
//         my_arr [index][hj]=1;                                     
//         }   
//         }
//         }
// // расстановка ферзей на поле упорядоченно вариант3
//     for (int str = 0; str < 8; str++) {  //str -строка
//         for (int index =0; index < 8; index++) { //index -столбец
//             if (examArr(my_arr,str,index)){
//                 my_arr [str ][index]=1;
//                 count++;                        
//                 }                                            
//         } //end for index         
//     }//end for str 

//  печать массива
    for (int str = 0; str < 8; str++) {  //str -строка
        System.out.println (Arrays.toString(my_arr [str ]) );
    } 
    System.out.println("count="+count);  
       
       
} //public static void main
        
} 
         
    

