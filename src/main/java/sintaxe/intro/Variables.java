package sintaxe.intro;

public class Variables {
    public static void main(String[] args) {

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
