package helloworld;

//creating BankAccount Class

public class BankAccount {
    
    //decalring variables/attributes
    
    private String name;
    private String branch;
    private int accno; //account number
    private float accbal; //account balance
    private float withamount;
    
    //constructor
    
    public BankAccount(String name,String branch,int accno, float accbal,float withamount){
        this.name = name;
        this.branch = branch;
        this.accno = accno;
        this.accbal = accbal;
        this.withamount = withamount;
    }
    
    //deposit method
    
    void deposit(){
        float depoamount = 3500;
        accbal = accbal + depoamount;
        System.out.println("\n----------Deposit has been Started!----------\n");
        System.out.println("Your New Account Balance : "+accbal);
        System.out.println("\n----------Successfully Deposited!------------\n");
    }
    
    //withdraw method
    
    void withdraw(){
        float tempbal = accbal - withamount; //quick check of balance if withdrowed from the current amount
        if((tempbal>1500) && (withamount<accbal)){ //checking wheather if the account balance is >1500 and withdrawing amount is less than account balance
            accbal = accbal - withamount;
            System.out.println("\n----------Your New Account Details-----------\n");
            accbalance();
            System.out.println("---------------------------------------------");
        }
        else{
            System.out.println("Insufficient Credits!!!");
        }
    }
    
    //method displaying account information
    
    void accbalance(){
        System.out.println("Account Name: "+name);
        System.out.println("Branch Name: "+branch);
        System.out.println("Account Number: "+accno);
        System.out.println("Account Balance: Rs."+accbal+"\n");
        
    }
    
    //interest calculator
    
    void interest(){
        float inter = (float) (4.5/100);
        accbal = accbal + (inter*accbal);
        System.out.println("Your New Balance with the Interest is: "+accbal);
    }
}
