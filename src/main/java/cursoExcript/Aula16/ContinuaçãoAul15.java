package cursoExcript.Aula16;
import java.util.Scanner;

public class ContinuaçãoAul15 {

    public static void main(String[] args) {

        final double vsom = 340.28; // m/s

        System.out.println("Digite o espaço de tempo: ");

        Scanner in = new Scanner(System.in);

        int tempo = in.nextInt();

        System.out.println("A distancia é de: " + tempo * vsom);

    }
}
