public class Main {
    public static void main(String[] args) {
        File file = new File("Java_Document.docx");
        String name1 = "Cuong";
        String role1 = "Admin";
        PersonProtectProxy person1 = new PersonProtectProxy(name1, role1);
        person1.openFile(file);
        person1.readFile(file);
        person1.writeFile(file);
        person1.closeFile(file);

        System.out.println("-------------------");
        
        String name2 = "Chuyen";
        String role2 = "Accountant";
        PersonProtectProxy person2 = new PersonProtectProxy(name2, role2);
        person2.openFile(file);
        person2.readFile(file);
        person2.writeFile(file);
        person2.closeFile(file);

        System.out.println("-------------------");
    }
}

