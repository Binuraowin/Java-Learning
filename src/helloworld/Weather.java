package helloworld;
public class Weather {
    public static void main(String[] args){
        //declaring variables;
        
        float temp; //tempreture
        String skycond; //sky-condition
        
        //initializing variables
        
        temp=40;
        skycond="Cloudy";
        
        //calculating & displaying outputs
        
        System.out.println("----------------Program is Starting---------------\n");
        
        if((temp>30) && (skycond=="Sunny")){
            System.out.println("Today is a sunny day! No need of Umbrella!");
        }
        else if((temp>30) && (skycond=="Cloudy")){
            System.out.println("It is most probably going to rain so grab an Umbrella!");
        }
        else if(temp<30){
            if(skycond=="Sunny" || skycond=="Cloudy"){
                System.out.println("Roam Freely!!!");
            }
            else{
                System.out.println("Stay Inside!!!");
            }
        }
        System.out.println("\n-------------------Program Ended!!!---------------");
    }
}
