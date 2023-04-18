package lesson5;

import java.util.HashMap;
import java.util.LinkedList;

public class task_with_seminar {
    public static void main(String[] args) {
        //задача1
        // HashMap <Integer, String> work_map=new HashMap<>();
        // work_map.put(4368547, "Иванов");
        // work_map.put(6841547, "Петров");
        // work_map.put(4236547, "Сидоров");
        // work_map.put(1168547, "Иванов");
        // work_map.put(2368547, "Баранов");

        // System.out.println(work_map.containsValue("Иванов")); 
        // for(var item : work_map.entrySet()) { //foreach
        //     if (item.getValue()=="Иванов")
        //     System.out.printf("[%d: %s]\n", item.getKey(),item.getValue());
       // }
       //задача2
//        HashMap <Character, Character> word=new HashMap<>();
//        String s="foougg";
//        String t="beejko";
//        char[] s_arr= s.toCharArray();
//        char[] t_arr= t.toCharArray();
//        Boolean res=true;
//     for (int i=0 ;i<s_arr.length;i++) {
//     if (s_arr.length!=t_arr.length){
//         res=false;
//             break;
//     }
//     if (!word.containsKey(s_arr[i] ))    {
//         word.putIfAbsent(s_arr[i],t_arr[i]);
//     }
//     else { 
//         if(word.get(s_arr[i])!=t_arr[i]){
//             res=false;
//             break;
//         }

//     }
// }
// System.out.println(res);
// System.out.println(word);

//задача3 работает с ошибкой!
HashMap <Character, Character> simbol=new HashMap<>();
LinkedList<Character> stek_sb =new LinkedList<>();
simbol.put('(',')');
simbol.put('[',']');
simbol.put('{','}');
String str="gf{jjj[h66],}";
Character item; //текущий символ
Boolean res=true;
for (int i=0; i<=str.length();i++){
    item=str.charAt(i);
   // System.out.println(stek_sb);
    if (simbol.containsKey(item)){//если символ-открывающая скобка
        stek_sb.add(simbol.get(item)); //запоминаем ту скбку которую надо искать
        System.out.println(stek_sb);
    }
    else {
        if (!stek_sb.isEmpty() && simbol.containsValue(item)){//если символ-закрывающая скобка
             if ( stek_sb.getLast()==item) {  // скобка  = элементу в стеке
             stek_sb.removeLast();
             System.out.println(stek_sb);
             }
            else {
            res=false; 
             }
        }   
    }
}
System.out.println(res);
}
}

