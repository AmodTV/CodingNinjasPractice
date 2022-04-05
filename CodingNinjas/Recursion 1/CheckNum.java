class CheckNum{
    public static boolean check(int arr[], int index, int n){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == n){
            return true;
        }
        boolean p = check(arr, index+1, n);
        if(p == true){
        return true; 
        }
        return false;
    }
    public static boolean check(int arr[], int n){
        return check(arr, 0 , n);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println(check(arr, 100));
    }
}