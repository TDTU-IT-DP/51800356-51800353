

public class Test{
    public static void main(String arr[]){
        //create Dog object
        Animal dog = new Dog("Frank");
        //create MakeSoundVisitor object
        AnimalVisitor msV = new MakeSoundVisitor();
        //call accept method to help MakeSoundVisitor object visit Dog object
        dog.accept(msV); //MakeSoundVisitor object visit Dog object 
                        //and make it become a parameter to make sound
        
        //the result after excute is: The Frank dog make sound: gau gau gau

        dog.accept(new ProtectHomeVisitor());
    }
}
