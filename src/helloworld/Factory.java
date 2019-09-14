package helloworld;
public class Factory {
    
    //main method
    
    public static void main(String[] args){
        employee();
    }
    
    //declaring employee details printing function
    
    static void employee(){
        String name = "Indrajith";
        int empid = 21018421;
        System.out.println("Employee name: "+name);
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Salary: "+salary());
    }
    
    //declaring employee salary function
    
    static float salary(){
        int workhours = 8;
        int workdays = 20;
        float rate = 182.50f;
        float salary= rate * workhours * workdays;
        return salary;
    }
}
