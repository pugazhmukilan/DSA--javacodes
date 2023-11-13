// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Quicksort {
    public static  int partition(int arr[], int low ,int high){
        int pi = arr[high];
        int i=low-1;
        for(int j = low;j<high;j++){
            if (arr[j]<pi){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        
        return i;
    }
    
    public static void quicksort(int arr[],int low,int high){
        if (low<high){
            int pindx= partition(arr, low , high);
            
            quicksort(arr,low,pindx-1);
            quicksort(arr,pindx+1,high);
        }
    }
    public static void main(String[] args) {
       int array[]={2,1,9,10,3,8};
       int n = array.length;
       
       quicksort(array,0,n-1);
       
       for(int i = 0;i<array.length;i++){
           System.out.print(array[i]+" ");
       }
    }
}