package exercises.basic;

import sintaxe.classes.classMethods;

public class mouseLigado {

    //Methods
    public static void isWorking(String marca, String isTurnOn) {
        if(isTurnOn == "Ligar"){
             System.out.println("O mouse da marca: " + marca + ", está em funcionamento");
        } else{
            System.out.println("O mouse da marca: " + marca + ", está está desligado");
        }
    }

    public static void main(String[] args) {
        mouseLigado myMouse = new mouseLigado();
        myMouse.isWorking("Logitech", "Ligar");
    }
}
