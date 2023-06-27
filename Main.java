import java.util.*;
public class Main {
    public static void threewayPartition(int[] A)
    {
        int start=0, mid=0;
        int end=A.length-1;
        int pivot=1;
        while(mid<=end)
        {
            if(A[mid]<pivot)
            {
                swap(A,start,mid);
                ++start;
                ++mid;
            }
            else if(A[mid]>pivot)
            {
                swap(A,mid,end);
                --end;
            }
            else
            {
                ++mid;
            }
        }
    }
    private static void swap(int[] A, int i,int j)
    {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public static void main(String[] args)
    {
        int[] A={1,2,2,2,0,0,1,0,1,1,1,2,2,2,0,0,0,0};
        threewayPartition(A);
        System.out.println(Arrays.toString(A));
    }


}
