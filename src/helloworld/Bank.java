package helloworld;

public class Bank {
     public static void main(String[] args){
        
        //instatiating an object
        
        BankAccount ba1 = new BankAccount("Indrajith","Homagama",123435235,1570,2000);
        /*ba1.name = "Indrajith";
        ba1.branch = "Homagama";
        ba1.accno = 15353452;
        ba1.accbal = 1500;
        ba1.withamount = 2000;*/
        
        //methods calling
        
        ba1.deposit();
        ba1.withdraw();
        ba1.interest();
        
        BankAccount ba2 = new BankAccount("Tharindu","Homagama",34523452,3300,1750);
        /*ba2.name = "Tharindu";
        ba2.branch = "Homagama";
        ba2.accno = 15353789;
        ba2.accbal = 3300;
        ba2.withamount = 1750;*/
        
        //methods calling
        
        ba2.deposit();
        ba2.withdraw();
        ba2.interest();
    }
}
