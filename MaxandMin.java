//Java program to find the maximum and minimum value of an array.

    import java.util.Scanner;
    public class MaxandMin {
        public static void main(String[] args){
                int a[]={50,30,40,20,60};
                Scanner sc=new Scanner(System.in);
                int max=a[0];
                int min=a[0];

                for(int i=1;i<a.length;i++){
                    if(a[i]>max){
                        max=a[i];
                    }
                    else{
                        min=a[i];
                    }
                }
                System.out.println("Max element os array is : "+max);
                System.out.println("Min element os array is : "+min);
                    sc.close();
               

        }
    
}
