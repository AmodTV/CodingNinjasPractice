class CountDigits{
    public static int countDigits(int n){
        if(n <= 9){
            return 1;
        }
        int smallAns = 1 + countDigits(n/10);
        return smallAns;
    }
    public static void main(String[] args){
        int n = 1;
        System.out.println(countDigits(n));
    }
}