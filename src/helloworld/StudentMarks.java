package helloworld;
public class StudentMarks {
    public static void main(String[] args){
        //declaring variables
        
        String stname; //student name
        String sub1; //1st subject name
        String sub2; //2nd subject name
        String sub3; //3rd subject name
        float mark1; //1st subject marks
        float mark2; //2nd subject marks
        float mark3; //3rd subject marks
        float avg; //average marks
        String status; //pass fail status
        
        //initializing variables
        
        stname="Indrajith";
        sub1="Maths";
        sub2="Physics";
        sub3="ICT";
        mark1=24.6f;
        mark2=23.2f;
        mark3=48.0f;
        
        //calculating
        
        avg=(mark1+mark2+mark3)/3.0f;
        if(avg>35.0f){
            status="Passed";
        }
        else{
            status="Failed";
        }
        
        //displaying the output
        System.out.println("------------Program is Starting!---------------\n");
        System.out.println("Student name: "+stname+"\n");
        System.out.println("Marks for "+sub1+": "+mark1);
        System.out.println("Marks for "+sub2+": "+mark2);
        System.out.println("Marks for "+sub3+": "+mark3);
        System.out.println("\nAverage Marks of the Student "+stname+" is "+avg);
        System.out.println("\nThis Student has "+status);
        System.out.println("\n------------Program Ended!---------------------");
    }
}
