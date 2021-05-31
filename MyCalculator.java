interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
      int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum+= i;
            }
        }
        System.out.println(sum);
        return sum;
       
    }

    public static void main(String args[]){  
        MyCalculator obj = new MyCalculator();  
        obj.divisor_sum(8);  
         }  
}