package model.entities;

public class Music {

    private String name;

    public Music(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " + name;
    }

    
    
    
}
