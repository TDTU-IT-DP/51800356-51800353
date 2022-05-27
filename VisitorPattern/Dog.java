
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    //override accept method to help Concrete Visitors object visit Dog object
    @Override
    public void accept(AnimalVisitor v) {
        v.visit(this);
    }

}
