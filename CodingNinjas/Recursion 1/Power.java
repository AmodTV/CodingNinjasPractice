class Power{
    public static int powerCalc(int x , int y){
        if(y == 0){
            return 1;
        }
        if(y == 1){
            return x;
        }
        return x * powerCalc(x, y-1);
    }
    public static void main(String[] args){
        int x = 3, y = 0;
        System.out.println(powerCalc(x,y));
    }
}