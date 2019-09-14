package helloworld;

public class FibbonachiApp {
    
    public static void main(String[] args){
        int n=40;
        System.out.println(func(n));
    }
    
    static int func(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return(func(n-1)+func(n-2));
        }
    }
}

