package sintaxe.intro;

public class Variables {
    public static void main(String[] args) {
        // Variáveis ​​são contêineres para armazenar valores de dados.
        /* tipos de variáveis:
        .String- armazena texto, como "Olá". Os valores da string estão entre aspas duplas
        .int- armazena inteiros (números inteiros), sem decimais, como 123 ou -123
        .float- armazena números de ponto flutuante, com decimais, como 19,99 ou -19,99
        .char- armazena caracteres únicos, como 'a' ou 'B'. Os valores de caracteres estão entre aspas simples
        .boolean- armazena valores com dois estados: verdadeiro ou falso
        */

          //variável que deve armazenar texto:
        String name = "João";
        System.out.println(name);

          // variável que deve armazenar um número:
        int myNum = 15;
        System.out.println(myNum);

          //pode declarar uma variável sem atribuir o valor e atribuir o valor posteriormente:
        int myNum1;
        myNum1 = 15;
        System.out.println(myNum);

          //Altere o valor de myNumde 15para 20:
        int myNum2 = 15;
        myNum2 = 26;// myNum is now 26
        System.out.println(myNum2);

          //Variáveis de Exibição

          // Para combinar texto e uma variável, use o + caractere:
          String name1 = "Diego";
          System.out.println("Hello " + name1);

          // pode usar o +caractere para adicionar uma variável a outra variável:

        String firstName = "Marcone";
        String lastName = " Santos";
        String fullName = firstName +  lastName;
        System.out.println(fullName);



    }
}
