public class PersonProtectProxy implements Action{
    private Person person;
    private String name;
    private String role;

    public PersonProtectProxy(String name, String role){
        this.name = name;
        this.role = role;
    }

    @Override
    public void openFile(File file) {
        if(this.role.equals("Admin") || this.role.equals("Manager")){
            this.person = new Person(name, role);
            person.openFile(file);
        }
        else{
            System.out.println(name + " can't open the file. Only Admin or Manager can open the file");
        }
    }

    @Override
    public void readFile(File file) {
        if(this.role.equals("Admin") || this.role.equals("Manager")){
            this.person = new Person(name, role);
            person.readFile(file);
        }
        else{
            System.out.println(name + " can't read the file. Only Admin or Manager can open the file");
        }
    }

    @Override
    public void writeFile(File file) {
        if(this.role.equals("Admin") || this.role.equals("Manager")){
            this.person = new Person(name, role);
            person.writeFile(file);
        }
        else{
            System.out.println(name + " can't write the file. Only Admin or Manager can open the file");
        }
    }

    @Override
    public void closeFile(File file) {
        if(this.role.equals("Admin") || this.role.equals("Manager")){
            this.person = new Person(name, role);
            person.closeFile(file);
        }
        else{
            System.out.println(name + " can't close the file. Only Admin or Manager can open the file");
        }
    }
   
}