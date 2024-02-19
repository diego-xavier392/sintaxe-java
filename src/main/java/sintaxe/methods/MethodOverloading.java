package sintaxe.methods;

public class MethodOverloading {
    static int methodOverloading(int x, int y) {
        return x + y;
    }
    static double methodOverloading(double x, double y){
        return x + y;
    }
    public static void main( String[] args){
        int myNum1 = methodOverloading(8, 5);
        double myNum2 = methodOverloading(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
