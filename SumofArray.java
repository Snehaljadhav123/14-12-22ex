// Q3 Program to sum values of an array

import java.util.Scanner;
public class SumofArray {
        public static void main(String args[]){
        int sum=0;

        Scanner sc=new Scanner(System.in);
        int[] array=new int[10];

        for(int i=0;i<10;i++)
        {
            System.out.println("Enter elements : ");
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println("Sumo of array elements are : "+sum);
        sc.close();
    }
}
