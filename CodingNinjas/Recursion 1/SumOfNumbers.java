import java.util.*;
class SumOfNumbers{
    public static int sumOfNatural(int n){
        if(n==1){
            return n;
        }
        return n + sumOfNatural(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfNatural(n));
    }
}