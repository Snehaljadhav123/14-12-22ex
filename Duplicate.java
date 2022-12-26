/* 
Java program to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
*/

//This is soreted array 

public class Duplicate {
    public static void main(String args[]){
            int[] array={20, 20, 30, 40, 50, 50, 50};
            int size=array.length;
            int[] temp=new int[size];
            int j=0,count=0;
            for(int i=0;i<size-1;i++)
            {
                
                if(array[i]!=array[i+1]){
                temp[j]=array[i];
                j++;
                }
                else{
                    count++;
                }
            }
            temp[j]=array[array.length-1];
            System.out.println("\naduplicate array elements are : ");
            for(int i=0;i<size;i++)
            {
                System.out.print(array[i]+" ");
            }
                System.out.println("\n\nAfter removing array elements are : ");
                for(j=0;j<temp.length;j++)
                {
                    System.out.print(temp[j]+" ");
                }

                System.out.println("\n\ncount of duplicate elements is : "+count);
                int temp_len=temp.length-count;
                System.out.println("\nlength of new array is "+temp_len);
        }
}
