package helloworld;

public class Monster extends Item{
    
    public Monster(int location, String description) {
        super(location, description);
    }
    
    public static void main(String[] args){
        Item i1 = new Item(2,"Lotus Tower");
        System.out.println(i1.getdes());
        System.out.println(i1.getlocate());
    }
}

