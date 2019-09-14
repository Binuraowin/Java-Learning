package helloworld;

public class FactorialApp {
    
    public static void main(String[] args){
        int n = 4;
        //System.out.println(fact1(n));
        System.out.println(fact2(n));
    }
    
    static int fact1(int n){
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return(n*fact1(n-1));
        }
    }
    
    static int fact2(int n){
        int i;
        int fact = 1;
        for(i = 1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
