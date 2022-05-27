
public abstract class Animal{
    
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    //add accept method to help Concrete Visitors object visit Animal objects
    public abstract void accept(AnimalVisitor v);
}

