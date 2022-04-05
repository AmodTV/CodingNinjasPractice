class AllIndex{
    static int arr1[] = new int[30], m = 0;
    public static void find(int arr[], int n , int target){
        if(n == arr.length){
            return;
        }
        if(target == arr[n]){
            arr1[m] = n;
            m++;
        }
        find(arr, n+1, target);
        return;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,1,1,1};
        find(arr, 0, 1);
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]+" ");
        }
    }
}