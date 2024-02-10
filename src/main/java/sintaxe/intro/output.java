package sintaxe.intro;

import sintaxe.old.variaveis.Numero;

public class output extends Numero {

    public static void main(String[] args) {
        //Escreva um programa que some 2 números

        double num1 = 5.5;
        double num2 = 10.20;

        double multi = num1 * num2;
        System.out.println("O resultado da multiplicação " + multi);

        /*double div = num1 / num2;
        System.out.println("O resultado da divisão " + div);
        */

        double soma = num1 + num2;
        System.out.println("O resultado da soma: " + soma);
    }



}
