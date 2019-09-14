package helloworld;
public class Country {
    
    //main method
    public static void main(String[] args){
        cities();
        choice();
        vehicles();
    }
    
    //declaring cities function
    static void cities(){
        
        //declaring & defining cities array
        
        String[] city = {"Neboda","Horana","Matugama","Homagama","Moragahahena"};
        System.out.println("Accessing the Array through Do While Loop\n");
        int i = 0;
        do{
            System.out.println(city[i]);
            i++;
        }while(i<5);
    }
    
    static void choice(){
        String[] food = new String[3];
        food[0] = "Rice & Curry";
        food[1] = "Soup";
        food[2] = "Wada";
        int i = 0;
        System.out.println("\nAccessing the Array through While Loop\n");
        while(i<3){
            System.out.println(food[i]);
            i++;
        }
    }
    
    static void vehicles(){
        String[] car;
        car = new String[2];
        car[0] = "Wagon R";
        car[1] = "Vezel";
        System.out.println("\nAccessing the Loop through For Loop\n");
        for(int i = 0;i < 2;i++){
            System.out.println(car[i]);
        }
    }
}
