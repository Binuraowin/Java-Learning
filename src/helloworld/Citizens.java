package helloworld;
public class Citizens {
    
    //simple user authentication program
    
    //authenticate function
    
    static void auth(){
        
        //declaring variables
        
        String name = "Indrajith";
        String dob = "1998/10/25";
        String address = "Neboda";
        String uname = "admin";
        String pass = "password";
        String SSN = "24683456";
        
        if((pass.contains("password")) && (uname.contains("admin"))){
            System.out.println("User's Name: "+name);
            System.out.println("Date of Birth: "+dob);
            
            if(SSN.length()<8){
                System.out.println("Invalid Social Security Number!");
            }
            else{
                System.out.print(SSN.substring(4)+"\n");
            }
        }
        else{
            System.out.println("Wrong Credintials! Try Again!!!");
        }
    }
    
    //main method
    
    public static void main(String[] args){
        
        //calling the auth function
        
        auth();
    }
}
