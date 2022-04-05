class SumOfArray{
    public static int helpSum(int arr[], int n){
        if(n == arr.length-1){
            return arr[n];
        }
        int smallAns = arr[n] + helpSum(arr, n+1);
        return smallAns;
    }
    public static int sum(int arr[]){
        return helpSum(arr, 0);
    }
    public static void main(String[] args){
        int arr[] = {4,2,1};
        System.out.println(sum(arr));
    }
}