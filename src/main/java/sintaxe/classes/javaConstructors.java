package sintaxe.classes;

public class javaConstructors {
    int modelYear;
    String modelName;
    
    public javaConstructors(int year, String name) {
        modelYear = year;
        modelName = name;

    }

    public static void main(String[] args) {
        javaConstructors myCar = new javaConstructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
        
    }
}
