import java.util.*;
class main
{
    public static void main(String args[])
    {
        int arr1[]={3,4,5,6};
        int arr2[]={9,10,11};
        int k=0;
        int temp[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            temp[k]=arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            temp[k]=arr2[i];
            k++;
        }
        System.out.println(Arrays.toString(temp));
    }
}