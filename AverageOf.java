//Program to calculate the average value of array elements.


import java.util.Scanner;
public class AverageOf {
    public static void main(String[] args){
            int sum=0;

            Scanner sc=new Scanner(System.in);
            int[] array=new int[5];
            // Sum of array elements
            for(int i=0;i<=array.length-1;i++)
            {
                System.out.println("Enter elements : ");
                array[i]=sc.nextInt();
                sum=sum+array[i];
            }
            double Average=sum/array.length;  //calculating the average
            System.out.println("Average of array elements is : "+Average);

        sc.close();
    }
    
}
