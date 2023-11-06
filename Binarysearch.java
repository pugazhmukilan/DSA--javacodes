public class Binarysearch {
    public static  int binarysearch(int arr[],int key){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==key){
                return m;
            }
            else if(arr[m]<key){
                l=m+1;

            }
            else{
                h=m-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};
        int n=arr.length;
        
        System.out.println(binarysearch(arr,6));
    }
    
}
