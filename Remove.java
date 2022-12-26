//Java program to remove a specific element from an array


public class Remove {
    public static void main(String args[]){
            int arr[]={10,40,30,6,12,8};
            int del_ele=40;
            for(int i=0;i<arr.length;i++){
                if(del_ele==arr[i]){
                    for(int j=i;j<arr.length-1;j++){
                        arr[j]=arr[j+1];
                    }
                    break;
                }
            }
            System.out.println("After removing array element i.e =40 : ");
            for(int i=0;i<arr.length-1;i++){
                System.out.println(arr[i]+" ");

        }
    
}
}
