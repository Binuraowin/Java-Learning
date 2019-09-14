package helloworld;

public class Student {
    //attributes
    private String name;
    private static int id = 5000;
    private String ssn;
    private String email;
    
    //constructor method
    public Student(String name,String ssn){
        this.name = name;
        this.ssn = ssn;
        id++;
    }
    
    //email generator
    public void email(){
        email = ("Your New Email Address is: "+name.toLowerCase()+"@gmail.com");
        System.out.println(email);
    }
    
    //userid generator
    public void userid(){
        String userid;
        userid = (id+"-"+(int)(Math.random()*10000)+"-"+ssn.substring(2, 6));
        System.out.println("Your User ID is: "+userid);
    }
    
    //main method
    public static void main(String[] args){
        Student stu1 = new Student("Indrajith","2994567");
        stu1.email();
        stu1.userid();
        System.out.println(stu1.toString());
}
}
