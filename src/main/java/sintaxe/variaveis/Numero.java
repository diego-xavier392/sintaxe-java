package sintaxe.variaveis;

public class Numero {
    public static void main(String[] args) {

        //1) Imprima apenas 3 variáveis numericas na tela:

        //ENTRADAS
        //Declarar 3 variaveis:
        int mouseQtBotoes = 1;
        int mouseQtConexao;
        int mouseLote;

        //PROCESSAMENTO:
        //Atribuir valores as variáveis
        mouseQtBotoes = 3;
        mouseQtConexao = 3;
        mouseLote = 642656;

        //SAIDA
        //imprimir valores no Terminal
        System.out.println("Quantidade de botoes: " + mouseQtBotoes);
        System.out.println("quantas conexões consigo fazer: " + mouseQtConexao);
        System.out.println("numero do lote: " + mouseLote);


        // usando o long consigo utilizar um valor maior

        long custoDaObra = 1164546645;
        long salarioGoverno = 1234458693;
        long velocidadeMaxima = 1234567894;


        System.out.println("custo da obra: " + custoDaObra);
        System.out.println("salário Governo= " + salarioGoverno);
        System.out.println("velocidade Máxima= " + velocidadeMaxima);
    }
}