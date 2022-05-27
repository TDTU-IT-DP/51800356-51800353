

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }
    //override accept method to help Concrete Visitors object visit Cat object
    @Override
    public void accept(AnimalVisitor v) {
        v.visit(this);
    }

   
    
}

