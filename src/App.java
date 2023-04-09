import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Passo 1: Declaração de variáveis + entrada de dados
        Scanner input = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        double quantoganhaporhora;
        double inss;
        double ird;
        double sindicato;
        double sliquido;
        System.out.println("Quanto você ganha por hora?? ");
        quantoganhaporhora = input.nextDouble();
        double horastrabalhadas;
        System.out.println("No total, quantas horas você trabalha por mês?? ");
        horastrabalhadas = input.nextDouble();
        double salario;
        // Passo 2: Calculo do salário
        salario = quantoganhaporhora * horastrabalhadas;
        // Passo 3: Resultado
        System.out.println("O salário bruto mensal é de: " + salario);
        // quanto pagou ao INSS
        inss = (salario * 8) / 100;
        System.out.println("Foi pago ao INSSum valor de: " + inss);
        // quanto pagou ao sindicato
        sindicato = (salario * 5) / 100;
        System.out.println("Foi pago ao Sindicato um valor de: " + sindicato);
        sliquido = salario - (salario * 11) / 100 - (salario * 8) / 100 - (salario * 5) / 100;
        System.out.println("No fim, o salário líquido é de:  " + sliquido);

    }
}
