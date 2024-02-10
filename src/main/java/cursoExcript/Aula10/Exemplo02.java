package cursoExcript.Aula10;

import java.util.Scanner;

public class Exemplo02 {

        public static void main(String[] args) {

            int num;

            System.out.println("Digite o número 12");

            Scanner in = new Scanner(System.in);

            num = in.nextInt();

            if(num==12){
                System.out.println("Obrigado por digitar corretamente! ");
            }else{
                System.out.println("O número digitado não foi o solicitado.");}
            }
}


