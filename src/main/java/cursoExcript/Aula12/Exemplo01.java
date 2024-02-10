package cursoExcript.Aula12;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double ciencia, portugues, matematica, quimica;

        System.out.println("Digite a sua nota de ciências: ");
        ciencia = in.nextDouble();
        System.out.println("Diegite a sua nota português: ");
        portugues = in.nextDouble();
        System.out.println("Digite a sua nota matemática: ");
        matematica = in.nextDouble();
        System.out.println("Diegite a sua nota química: ");
        quimica = in.nextDouble();

        double soma = (ciencia + portugues + matematica + quimica) / 4;

        if(soma >= 7){
            System.out.println("Voce foi aprovado, a sua média foi de: " + soma);
        }else{
            System.out.println("voce foi reprovado, a sua média foi de: " + soma);
        }
    }
}
