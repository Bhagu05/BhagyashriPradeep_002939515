/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author bhagy
 */
public class ArrayLab {
    public int ArrayEvenOdd(int x){
         int sum = 0;
         if(x%2 == 0){
             sum=2;
         }
         else{
             sum=3;
         }
         return sum;
   }

public static void main(String args[]){
    int arr[]={2,4,6,8,10};
    ArrayLab a = new ArrayLab();
    System.out.println("Array 1");
    for(int i=0; i<arr.length;i++)
    {
        System.out.println("" + arr[i]);
    }
    System.out.println();
    System.out.println(" Array after updating :");
    for(int i=0; i<arr.length;i++)
    {
        int values = a.ArrayEvenOdd(i);
        System.out.print(" " + (values * arr[i]));
        
    }
    
    
}
}






