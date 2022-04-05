class FirstIndex{
    public static int find(int arr[], int n, int target){
        int sa = -1;
        if(n == arr.length){
            return -1;
        }
        if(target == arr[n]){
            sa = n;
        }
        if(sa != -1){
            return sa;
        } 
        sa = find(arr,n+1, target);
        return sa;
    }
    public static int find(int arr[] , int target){
        return find(arr, 0, target);
    }
    public static void main(String[] args){
        int arr[] = {9,10,10,10};
        System.out.println(find(arr, 10));
    }
}