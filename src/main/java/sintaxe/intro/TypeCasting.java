package sintaxe.intro;

public class TypeCasting {
    public static void main(String[] args) {

        /* A conversão de tipo ocorre quando você atribui um valor de um tipo de dados primitivo a outro tipo.
        Java, existem dois tipos de conversão:
          1) Ampliando Casting (automaticamente) - convertendo um tipo menor em um tamanho de tipo maior
byte-> short-> char-> int-> long-> float->double.

          2) Estreitando Casting (manualmente) - convertendo um tipo maior em um tipo de tamanho menor
double-> float-> long-> int-> char-> short->byte */


       //Ampliando Casting;
        int myInt = 9;
       double myDouble = myInt;

       System.out.println(myInt);
       System.out.println(myDouble);

       //Estreintando Casting;
        double myDouble1 = 7.52d;
        int myInt1 = (int)  myDouble1; // manual casting: double to int

        System.out.println(myDouble1); // Outputs 7.52d
        System.out.println(myInt1);  // Outputs 7
    }
}
