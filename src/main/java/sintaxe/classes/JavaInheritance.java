package sintaxe.classes;

 class JavaInheritance {
    protected String brand = "Ford";
        public void honk() {
            System.out.println("Tuut, tuut!");

        }
    }
    class Car extends JavaInheritance {
        private String modelName = "Mustang";

        public static void main(String[] args) {
            Car myFastCar = new Car();
            myFastCar.honk();
            System.out.println(myFastCar.brand + "   " + myFastCar.modelName);

        }
    }
