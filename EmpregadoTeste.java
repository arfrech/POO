import java.util.Scanner;
public class EmpregadoTeste{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        Empregado empregado1 = new Empregado();

        System.out.println("Digite as informacoes necessaria:");
        System.out.print("Nome = ");
        empregado1.setNome(teclado.nextLine());
        System.out.print("Cargo = ");
        empregado1.setCargo(teclado.nextLine());
        System.out.print("Salario = ");
        empregado1.setSalario(teclado.nextDouble());
        System.out.print("Porcentagem aumento salarial = ");
        empregado1.setPorcentagemAumento(teclado.nextDouble());
        System.out.println("");
        System.out.println("");
        System.out.println("Processando...");
        System.out.println("");
        System.out.println("");

        empregado1.imprimir();
    }
}