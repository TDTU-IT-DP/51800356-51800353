


public class PlayWithBallVisitor implements AnimalVisitor{

    // Play With Ball with Cat object
    @Override
    public void visit(Cat cat) {
        System.out.println("The " + cat.getName() + " cat stroked the ball"); //vuot ve trai banh
        
    }
    // Play With Ball with Dog object
    @Override
    public void visit(Dog dog) {
        System.out.println("The " + dog.getName() + " dog gnaw at the ball"); //ngoam trai banh
        
    }
    
}
