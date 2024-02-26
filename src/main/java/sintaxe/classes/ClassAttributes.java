package sintaxe.classes;

public class ClassAttributes {
    String fname = "Diego";
    String lname = "Xavier";
    int age = 26;
    public static void main(String[] args) {
        ClassAttributes myObj = new ClassAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }

}
