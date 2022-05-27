public class Person implements Action{
    String Name;
    String Role;
    public Person(String Name, String Role){
        this.Name = Name;
        this.Role = Role;
    }
    @Override
    public void openFile(File file) {
        // TODO Auto-generated method stub
        String open_file = " open file " + file.getFile();
        System.out.println(Name + open_file);
    }
    @Override
    public void readFile(File file) {
        // TODO Auto-generated method stub
        String read_file = " read file " + file.getFile();
        System.out.println(Name + read_file);
    }
    @Override
    public void writeFile(File file) {
        // TODO Auto-generated method stub
        String write_file = " write to file " + file.getFile();
        System.out.println(Name + write_file);
    }
    @Override
    public void closeFile(File file) {
        // TODO Auto-generated method stub
        String close_file = " close file " + file.getFile();
        System.out.println(Name + close_file);
    }

    
}