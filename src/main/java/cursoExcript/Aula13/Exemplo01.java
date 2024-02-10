package cursoExcript.Aula13;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {


        // Calculadora

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");
        System.out.println("Digite 3 para multilicar");
        System.out.println("Digite 4 para dividir");

        int i = in.nextInt();

        System.out.println("Digite a sua nota de ciências: ");
        double ciencia = in.nextDouble();

        System.out.println("Digite a sua nota português: ");
        double portugues = in.nextDouble();

        if( i == 1) {
            System.out.println(ciencia + portugues);
        }else{
            if(i == 2) {
                System.out.println(ciencia - portugues);
            }else{
                if(i == 3) {
                    System.out.println(ciencia * portugues);
                }else{
                    if(i == 4) {
                        System.out.println(ciencia / portugues);


                }

                }


            }


}


    }
}
