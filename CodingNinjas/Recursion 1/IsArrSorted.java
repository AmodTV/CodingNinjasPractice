class IsArrSorted{
    public static boolean checkSort(int[] arr, int n){
        if(n == arr.length-1 || arr.length == 0){
            return true;
        }
        if(arr[n] > arr[n+1]){
            return false;
        }
        return checkSort(arr,n+1);
    }
    public static void main(String[] args){
        int arr[] = {1,1,1,1};
        System.out.println(checkSort(arr,0));
    }
}