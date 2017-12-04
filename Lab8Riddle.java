/*
*Nick Riddle
*Date Compled 11/8/2017
 */
package lab8riddle;

import java.util.Random;
public class Lab8Riddle {
    static final int sortSize = 20;
    static int holder = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] sorter = new int[sortSize];
        
        //Filll an array of type int named "sorter" of length sortSize
        for (int i=0; i < sortSize; i++){
            sorter[i] = (int)(Math.random()*89)+10;
        }
        bubbleSort(sorter);
    }
    
    public static void bubbleSort(int[] s){
        boolean cleanrun = false;
       int j = 0;
       while (!cleanrun){
           cleanrun = true;
           System.out.print("|");
           for (int i = 0; i < sortSize; i++){
               System.out.print(" " +s[i] +" |");
           }
           System.out.print("  - Pass #" + j + "\n");
           for (int i = 1; i < sortSize; i ++){
               if (s[i]< s[i-1]){
                   holder = s[i-1];
                   s[i-1] = s[i];
                   s[i] = holder;
                   cleanrun = false;
                   
               }
               
           }
               
           j++;        
       }
       
    }
}
