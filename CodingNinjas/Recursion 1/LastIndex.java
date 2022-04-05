class LastIndex{
    public static int find(int arr[], int n, int target){
        if(n<0){
            return -1;
        }
        if(arr[n] == target){
            return n;
        }
        int sa = find(arr, n - 1 , target);
        return sa;
    }
    public static int find(int arr[], int target){
        return find(arr, arr.length-1, target);
    }
    public static void main(String[] args){
        int arr[] = {1,8,3,8,8};
        System.out.println(find(arr,1));

    }
}