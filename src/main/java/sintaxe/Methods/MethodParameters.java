package sintaxe.Methods;

public class MethodParameters {
  static void myMethods(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args) {
        myMethods("Diego",26);
        myMethods("Marcone", 27);
        myMethods("Angelina", 32);

    }
}
