public class  BubbleSort {
    public static void main(String[] args)
    {
        int arr[] ={3,-2,8,14,-20,5};

        for(int i =arr.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                  
                //if(arr[j]< arr[j+1]  //descending order 
                if(arr[j] > arr[j+1])  //ascending order 
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
