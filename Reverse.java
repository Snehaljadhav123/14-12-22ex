
//Java program to reverse an array of integer values.


public class Reverse {
        public static void main(String args[]){
            int[] arr_ele={111,34,22,6,77,8};
            System.out.println("Before reversing elements are : ");

            for(int i=0;i<arr_ele.length;i++){
                System.out.print(arr_ele[i]+" ");

            }
            System.out.println("\n\nAfter reversing elements are : ");

            for(int i=arr_ele.length-1;i>=0;i--){
                System.out.print(arr_ele[i]+" ");

            }
        }
    
}
