package sintaxe.classes;
import java.util.Scanner;

public class oop {

    public static void main(String[] args) {

        final double vsom = 340.28; // m/s

        System.out.println("Digite o espaço de tempo: ");

        Scanner in = new Scanner(System.in);

        int tempo = in.nextInt();

        System.out.println("A distancia é de: " + tempo * vsom);

    }
}
