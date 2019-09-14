package helloworld;

public class SalaryArray {
    public static void main(String[] args){
        
        //declaring the salary array
        int[] salary = {12500,34000,45000,5678,3451,1300,32424,234665,32334,32451};
        System.out.println("Minimum Salary : $"+min(salary));
        System.out.println("Maximum Salary : $"+max(salary));
        System.out.println("Average Salary : $"+avg(salary));
    }
    
    //min function
    
    static int min(int[] salary){
        int minsal = salary[0];
        for(int i = 1; i < salary.length;i++){
            if(salary[i]<minsal){
                minsal = salary[i];
            }
        }
        return minsal;
    }
    
     //max function
    
    static int max(int[] salary){
        int maxsal = salary[0];
        for(int i = 1; i < salary.length;i++){
            if(salary[i]>maxsal){
                maxsal = salary[i];
            }
        }
        return maxsal;
    }
    
     //avg function
    
    static float avg(int[] salary){
        int sal = 0;
        for(int i = 0; i < salary.length;i++){
            sal=sal+salary[i];
        }
        float avg = sal/salary.length;
        return avg;
    }
}
