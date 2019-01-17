/* 
Правило треугольника

*/



import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
   int numb1 = Integer.parseInt(reader.readLine());
   int numb2 = Integer.parseInt(reader.readLine());
   int numb3 = Integer.parseInt(reader.readLine());
   
   if (numb1 < numb2 + numb3 && numb2 < numb1 + numb3 && numb3 < numb2 + numb1 ){
       System.out.println("Треугольник существует");
   }
   else{
       System.out.println("Треугольник не существует");
   }
   
 }  
