import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        int arr[]={10, 8, 12, 14, 6, 16, 20, 5, 4, 5};
        int swap=0;
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}