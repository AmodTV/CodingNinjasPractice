class PrintNumbers{
    public static int print(int n){
        if(n == 1){
            System.out.print(n+" ");
            return n;
        }
        print(n-1);
        System.out.print(n+" ");
        return n;
    }
    public static void main(String[] args){
        int n = 5;
        print(n);
    }
}