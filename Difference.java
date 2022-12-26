/*
 Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
*/

import java.util.Scanner;
public class Difference {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

                int size;
                System.out.println("Enter size of array you want ? ");
                size=sc.nextInt();
                int[] aray=new int[size];
                int largest=aray[0];
                int smallest=aray[0];
                if(size>=1)
                {
                    System.out.println("Enter array elements : ");
                    for(int i=0;i<aray.length;i++)
                    {
                        aray[i]=sc.nextInt();
                    }

                    for(int i=0;i<aray.length;i++){
                        if(aray[i]>largest){
                            largest=aray[i];
                        }
                        else{
                            smallest=aray[i];
                        }
                    }
                }else
                {
                    System.out.println("invalid input size should be greater than one ");
                }
                
                int difference=largest-smallest;
                System.out.println("Largest value is : "+largest);
                System.out.println("samllest value is : "+smallest);
                System.out.println("difference between largest and smallest va;lue  is : "+difference);
                sc.close();

    }
}
