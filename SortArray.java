//Program to sort an array of integers and String


import java.util.Arrays;
public class SortArray {
    public static void main(String args[]){
            int a[]={10,45,6,9,0,44,56,12};
            System.out.println("Elements before sorting are : ");
            for(int i=0;i<a.length;i++){
                
               System.out.print(a[i]+" ");
            }
            System.out.println("\n\nElements after  sorting are : ");

            Arrays.sort(a);
            for(int i=0;i<a.length;i++){
                
                System.out.print(a[i]+" ");
             }
        }
    
}
