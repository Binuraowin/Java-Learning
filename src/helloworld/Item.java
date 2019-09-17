package helloworld;

public class Item {
    private int location;
    private String description;
    
    public Item(int location,String description){
        this.location = location;
        this.description = description;
    }
    
    public void setlocate(int location){
        this.location = location;
    }
    
    public int getlocate(){
        return location;
    }
    
    public void setdes(String description){
        this.description = description;
    }
    
    public String getdes(){
        return description;
    }
}
