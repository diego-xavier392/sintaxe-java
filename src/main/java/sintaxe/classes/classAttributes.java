package sintaxe.classes;

public class classAttributes {
    String fname = "Diego";
    String lname = "Xavier";
    int age = 26;
    public static void main(String[] args) {
        classAttributes myObj = new classAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }

}
