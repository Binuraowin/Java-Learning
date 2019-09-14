package helloworld;
public class SalaryCalculator {
    public static void main(String[] args){
        //Declaring Variables
        
        String carrer;
        int hoursperweek;
        double rate;
        double salary;
        
        //initializing variables
       
        carrer="Junior Software Developer";
        hoursperweek=8;
        rate=12.50;
        
        //calculationg salary
        
        salary=rate*hoursperweek;
        
        //displaying the output
        
        System.out.println("My carrer is: "+carrer);
        
        System.out.println("My Salary for a month as a "+carrer+ " is $"+salary);
    }
}
