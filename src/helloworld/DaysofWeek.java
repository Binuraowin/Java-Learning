package helloworld;
public class DaysofWeek {
    public static void main(String[] args){
        //declaring variables
        
        String day;
        
        //initializing variables
        
        day="Saturday";
        
        //switching and displaying the output
        
        switch(day){
            case "Monday": System.out.println("Today is a Monday and it is a week day!!!");break;
            case "Tuesday": System.out.println("Today is a Tuesday and it is a week day!!!");break;
            case "Wednesday": System.out.println("Today is a Wednesday and it is a week day!!!");break;
            case "Thursday": System.out.println("Today is a Thursday and it is a week day!!!");break;
            case "Friday": System.out.println("Today is a Firday and it is a week day!!!");break;
            default : System.out.println(day+" is not a Weekday!!!");break;

        }
       
    }
}
