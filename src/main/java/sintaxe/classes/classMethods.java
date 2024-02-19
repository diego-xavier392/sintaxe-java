package sintaxe.classes;

public class classMethods {
    public static void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public static void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        classMethods myCar = new classMethods();
        myCar.fullThrottle();
        myCar.speed(200);
    }

}
