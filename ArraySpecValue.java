//Java program to test if an array contains a specific value

//import java.util.Scanner;
     public class ArraySpecValue {
          public static void main(String[] args){
          //Scanner sc=new Scanner(System.in);
          int array[]={10,12,3,4,19,20};
          int special=100;
          boolean flag=false;
     
          for(int i=0;i<array.length;i++)
          {
                    if(array[i]==special){
                         flag=true;
                         System.out.println("Special element found : "+array[i]);
                         break;
                    }
          }
          if(flag==false){
               System.out.println(" Special Element not found ");
          }
     
}
}
