public class Quicksort {
    public static int  partition (int arr[],int low,int high){
        int pi=arr[high];
        int i=low-1;

        for (int j=low;j<high;j++){
            if(arr[j]<pi){
                i++;

                //sawp
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pi;
        arr[high]=temp;

        return i;

    }
    public static void quicksort(int arr[],int low,int high){
        if (low<=high){
            int pi =partition(arr,low,high);

            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }


    public static void main(String[] args) {
        
        int array[]={2,5,67,3,6,8,1};
        int n=array.length;
        quicksort(array,0,n-1);

        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
