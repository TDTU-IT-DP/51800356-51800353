

public class ProtectHomeVisitor implements AnimalVisitor {

    @Override
    public void visit(Cat cat) {
        System.out.println("OMG, The " + cat.getName() + " cat will run away");
        
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("The " + dog.getName() + " dog will well done");
        
    }
    
}
