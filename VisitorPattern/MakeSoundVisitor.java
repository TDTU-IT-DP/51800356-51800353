

public class MakeSoundVisitor implements AnimalVisitor {

    //Make sound with Cat object
    @Override
    public void visit(Cat cat) {
        System.out.println("The " + cat.getName() + " cat make sound: meow meow meow");
    }

    //Make sound with Dog object
    @Override
    public void visit(Dog dog) {
        System.out.println("The " + dog.getName() + " dog make sound: gau gau gau");
    }

}
